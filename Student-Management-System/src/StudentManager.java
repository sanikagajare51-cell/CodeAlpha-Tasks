import java.io.*;
import java.util.*;

public class StudentManager {

    private List<Student> students = new ArrayList<>();
    private final String FILE_NAME = "students.txt";

    public StudentManager() {
        loadStudents();
    }

    public void addStudent(Student student) {
        students.add(student);
        saveStudents();
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println("Roll No: " + s.getRollNo());
            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
            System.out.println("-------------------");
        }
    }

    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                System.out.println("Student Found:");
                System.out.println("Name: " + s.getName());
                System.out.println("Age: " + s.getAge());
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int rollNo) {
        students.removeIf(student -> student.getRollNo() == rollNo);
        saveStudents();
        System.out.println("Student deleted successfully.");
    }

    private void saveStudents() {
        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Student s : students) {
                writer.write(s.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    private void loadStudents() {
        File file = new File(FILE_NAME);

        if (!file.exists())
            return;

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                int roll = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);

                students.add(new Student(roll, name, age));
            }

        } catch (IOException e) {
            System.out.println("Error loading file.");
        }
    }
}
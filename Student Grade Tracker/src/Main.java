import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeTracker tracker = new GradeTracker();

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println("      STUDENT GRADE TRACKER");
            System.out.println("==================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Generate Report Card");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Math Marks: ");
                    double math = sc.nextDouble();

                    System.out.print("Enter Science Marks: ");
                    double science = sc.nextDouble();

                    System.out.print("Enter English Marks: ");
                    double english = sc.nextDouble();

                    Student student =
                            new Student(id,
                                    name,
                                    math,
                                    science,
                                    english);

                    tracker.addStudent(student);

                    break;

                case 2:

                    tracker.displayStudents();
                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    Student found =
                            tracker.searchStudent(searchId);

                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Student not found!");

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    int reportId = sc.nextInt();

                    Student reportStudent =
                            tracker.searchStudent(reportId);

                    if (reportStudent != null)
                        ReportCard.generateReport(reportStudent);
                    else
                        System.out.println("Student not found!");

                    break;

                case 5:

                    System.out.println(
                            "Thank You For Using Student Grade Tracker!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
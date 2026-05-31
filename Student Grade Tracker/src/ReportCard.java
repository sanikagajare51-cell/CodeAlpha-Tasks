public class ReportCard {

    public static void generateReport(Student student) {

        System.out.println("\n==============================");
        System.out.println("      STUDENT REPORT CARD");
        System.out.println("==============================");

        System.out.println("Student ID    : " +
                student.getStudentId());

        System.out.println("Student Name  : " +
                student.getStudentName());

        System.out.println();

        System.out.println("Math Marks    : " +
                student.getMathMarks());

        System.out.println("Science Marks : " +
                student.getScienceMarks());

        System.out.println("English Marks : " +
                student.getEnglishMarks());

        System.out.println();

        System.out.println("Total Marks   : " +
                student.calculateTotal());

        System.out.println("Percentage    : " +
                String.format("%.2f",
                        student.calculatePercentage()) + "%");

        System.out.println("Grade         : " +
                student.calculateGrade());

        System.out.println("==============================");
    }
}
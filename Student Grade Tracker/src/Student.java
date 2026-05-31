public class Student {

    private int studentId;
    private String studentName;
    private double mathMarks;
    private double scienceMarks;
    private double englishMarks;

    public Student(int studentId, String studentName,
                   double mathMarks,
                   double scienceMarks,
                   double englishMarks) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getMathMarks() {
        return mathMarks;
    }

    public double getScienceMarks() {
        return scienceMarks;
    }

    public double getEnglishMarks() {
        return englishMarks;
    }

    public double calculateTotal() {
        return mathMarks + scienceMarks + englishMarks;
    }

    public double calculatePercentage() {
        return calculateTotal() / 3;
    }

    public String calculateGrade() {

        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 40)
            return "D";
        else
            return "F";
    }

    @Override
    public String toString() {

        return "ID: " + studentId +
                " | Name: " + studentName +
                " | Percentage: " +
                String.format("%.2f", calculatePercentage()) +
                "% | Grade: " + calculateGrade();
    }
}
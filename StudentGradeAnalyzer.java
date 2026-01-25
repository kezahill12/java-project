public class StudentGradeAnalyzer {
    
    public static double calculateAverage(double assignment, double midterm, double finalExam) {
        return (assignment + midterm + finalExam) / 3;
    }
    public static char determineGrade(double average) {
        if (average >= 90 && average <= 100) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Main method
    public static void main(String[] args) {
        double assignmentScore = 85;
        double midtermScore = 78;
        double finalExamScore = 92;
        double averageScore = calculateAverage(
                assignmentScore,
                midtermScore,
                finalExamScore
        );
        char finalGrade = determineGrade(averageScore);
        System.out.println("Assignment Score: " + assignmentScore);
        System.out.println("Midterm Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalExamScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Final Grade: " + finalGrade);
    }
}

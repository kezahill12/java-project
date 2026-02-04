public class StudentGrades {
    public static void main(String[] args) {

        int[] marks = {85, 92, 78, 90, 88};
        int highestMark = marks[0];
        int lowestMark = marks[0];
        double totalMarks = 0;
        int passCount = 0;
        int failCount = 0;

        for (int i = 0;i < marks.length; i++) {
            marks[i] += 5;
            if (marks[i] > 100) {
                marks[i] = 100;
            }
            System.out.println("Student mark: " + marks[i]);
            totalMarks += marks[i];

            if (marks[i] > highestMark) {
                highestMark = marks[i];
                System.out.println("New highest mark found: " + highestMark);
            }
            if (marks[i] < lowestMark) {
                lowestMark = marks[i];
                System.out.println("New lowest mark found: " + lowestMark);
            }
            if (marks[i] >= 80) {
                passCount++;
            } else {
                failCount++;
            }
        }
        double average = totalMarks / marks.length;
        System.out.println("Final highest mark is: " + highestMark);
        System.out.println("Final lowest mark is: " + lowestMark);
        System.out.println("Total students passed: " + passCount);
        System.out.println("Total students failed: " + failCount);
        System.out.println("Average mark: " + average);
    }
}

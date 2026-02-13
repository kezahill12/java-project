import java.util.Arrays;

public class GradeManager {

    private int[] grades;
    private int size;

    public GradeManager(int capacity) {
        grades = new int[capacity];
        size = 0;
    }

    public void addGrade(int grade) throws InvalidGradeException {

        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade must be between 0 and 100");
        }

        if (size >= grades.length) {
            throw new ArrayIndexOutOfBoundsException("Grade list is full");
        }

        grades[size] = grade;
        size++;
        System.out.println("Grade added: " + grade);
    }

    public void displayGrades() {

        if (size == 0) {
            System.out.println("No grades available.");
            return;
        }

        System.out.print("Grades: ");
        for (int i = 0; i < size; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
    }

    public void sortGrades() {
        Arrays.sort(grades, 0, size);
        System.out.println("Grades sorted successfully.");
    }

    public boolean searchGrade(int target) {

        for (int i = 0; i < size; i++) {
            if (grades[i] == target) {
                return true;
            }
        }
        return false;
    }

    public double calculateAverage() {

        if (size == 0) {
            throw new IllegalArgumentException("Cannot calculate average. No grades present.");
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += grades[i];
        }

        return (double) sum / size;
    }

    public int getHighestGrade() {

        if (size == 0) {
            throw new IllegalArgumentException("No grades available.");
        }

        int max = grades[0];
        for (int i = 1; i < size; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }

        return max;
    }

    public int getLowestGrade() {

        if (size == 0) {
            throw new IllegalArgumentException("No grades available.");
        }

        int min = grades[0];
        for (int i = 1; i < size; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }

        return min;
    }
}

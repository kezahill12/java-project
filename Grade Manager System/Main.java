public class Main {

    public static void main(String[] args) {

        GradeManager manager = new GradeManager(5);

        try {
            manager.addGrade(80);
            manager.addGrade(90);
            manager.addGrade(70);
            manager.addGrade(60);
            manager.addGrade(85);

            manager.addGrade(150);

        } catch (InvalidGradeException e) {
            System.out.println("InvalidGradeException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to add grades.\n");
        }

        manager.displayGrades();

        manager.sortGrades();
        manager.displayGrades();

        System.out.println("\nSearching for 90: " + manager.searchGrade(90));
        System.out.println("Searching for 50: " + manager.searchGrade(50));

        try {
            System.out.println("\nAverage grade: " + manager.calculateAverage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Highest grade: " + manager.getHighestGrade());
            System.out.println("Lowest grade: " + manager.getLowestGrade());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Empty Manager Test ---");
        GradeManager empty = new GradeManager(3);

        try {
            empty.calculateAverage();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

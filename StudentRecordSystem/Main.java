import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        manager.loadFromFile("students.txt");

        int choice;

        do {

            System.out.println("\n1. Display All");
            System.out.println("2. Average Score");
            System.out.println("3. Top Student");
            System.out.println("4. Lowest Student");
            System.out.println("5. Passed Students");
            System.out.println("6. Failed Students");
            System.out.println("7. Add Student");
            System.out.println("8. Update Score");
            System.out.println("9. Sort By Score");
            System.out.println("0. Save & Exit");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    manager.displayAll();
                    break;

                case 2:
                    System.out.println("Average score: " + manager.getAverageScore());
                    break;

                case 3:
                    System.out.println("Top student: " + manager.getTopStudent());
                    break;

                case 4:
                    System.out.println("Lowest student: " + manager.getLowestStudent());
                    break;

                case 5:
                    manager.displayPassed();
                    break;

                case 6:
                    manager.displayFailed();
                    break;

                case 7:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Score: ");
                    int score = sc.nextInt();
                    manager.addStudent(new Student(id, name, age, score));
                    break;

                case 8:
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();
                    System.out.print("New Score: ");
                    int newScore = sc.nextInt();
                    manager.updateScore(sid, newScore);
                    break;

                case 9:
                    manager.sortByScore();
                    break;

                case 0:
                    manager.saveToFile("students.txt");
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegistrationSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        boolean running = true;

        while (running) {
            System.out.println("\n===== STUDENT REGISTRATION MENU =====");
            System.out.println("1. Add student");
            System.out.println("2. View students");
            System.out.println("3. Remove student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("Add student selected");
                    break;

                case 2:
                    System.out.println("View students selected");
                    break;

                case 3:
                    System.out.println("Remove student selected");
                    break;

                case 4:
                    running = false;
                    System.out.println("Goodbye 👋");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        input.close();
    }
}

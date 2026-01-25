import java.util.Scanner;

public class ServiceUsageTracker {

    static double totalUnits = 100;
    static double usedUnits = 0;

    public static void consumeUnits(double units) {
        double remainingUnits = totalUnits - usedUnits;

        if (units < 0) {
            System.out.println("Invalid input: Units cannot be negative.");
            return;
        }

        if (units > remainingUnits) {
            System.out.println("Error: Not enough units available.");
            return;
        }

        usedUnits += units;
        System.out.println(units + " units consumed successfully.");
    }

    public static void checkRemainingUnits() {
        double remainingUnits = totalUnits - usedUnits;
        System.out.println("Remaining units: " + remainingUnits);
    }

    public static void calculateUsagePercentage() {
        if (totalUnits == 0) {
            System.out.println("Cannot calculate usage percentage (division by zero).");
            return;
        }

        double percentage = (usedUnits / totalUnits) * 100;
        System.out.printf("Usage percentage: %.2f%%\n", percentage);
    }

    public static void resetUsage() {
        usedUnits = 0;
        System.out.println("Usage has been reset successfully.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Service Usage Tracker ---");
            System.out.println("1. Consume Service Units");
            System.out.println("2. Check Remaining Units");
            System.out.println("3. View Usage Percentage");
            System.out.println("4. Reset Usage");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter units to consume: ");
                    double units = scanner.nextDouble();
                    consumeUnits(units);
                    break;

                case 2:
                    checkRemainingUnits();
                    break;

                case 3:
                    calculateUsagePercentage();
                    break;

                case 4:
                    resetUsage();
                    break;

                case 0:
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Inventory Tracker ===");
            System.out.println("1. Add new item");
            System.out.println("2. Remove item");
            System.out.println("3. Update item");
            System.out.println("4. Display all items");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    System.out.print("Enter item ID: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    Item item = new Item(name, id, quantity, price);
                    inventory.addItem(item);
                    break;

                case 2:
                    System.out.print("Enter item ID to remove: ");
                    int removeId = scanner.nextInt();
                    inventory.removeItem(removeId);
                    break;

                case 3:
                    System.out.print("Enter item ID to update: ");
                    int updateId = scanner.nextInt();

                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();

                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();

                    inventory.updateItem(updateId, newQuantity, newPrice);
                    break;

                case 4:
                    inventory.displayItems();
                    break;

                case 5:
                    System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}

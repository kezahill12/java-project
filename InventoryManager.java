public class InventoryManager {

    static class Item {

        public String name;
        public int quantity;
        public double price;

        public Item(String name, int quantity, double price) {
            this.name = name;
            this.quantity = Math.max(0, quantity);
            this.price = Math.max(0, price); 
        }
        public void addStock(int amount) {
            if (amount > 0) {
                quantity += amount;
                System.out.println("Added " + amount + " units:");
            } else {
                System.out.println("Error: Invalid add amount!");
            }
        }

        public void removeStock(int amount) {
            if (amount > 0 && amount <= quantity) {
                quantity -= amount;
                System.out.println("Removed " + amount + " units:");
            } else {
                System.out.println("Error: Invalid removal amount! Adjusted to 0");
                quantity = 0;
            }
        }
        public double getValue() {
            return quantity * price;
        }

        public void displayItem() {
            System.out.println(
                "Item: " + name +
                ", Quantity: " + quantity +
                ", Price: $" + price +
                ", Value: $" + getValue()
            );
        }
    }

    public static void main(String[] args) {

        Item laptop = new Item("Laptop", 10, 999.99);
        Item mouse = new Item("Mouse", 50, 19.99);

        laptop.displayItem();
        laptop.addStock(5);
        laptop.displayItem();

        System.out.println("Tried to remove 20 units:");
        laptop.removeStock(20);
        laptop.displayItem();

        System.out.println();

        mouse.displayItem();

        System.out.println("\nBulk stock addition:");
        for (int i = 1; i <= 3; i++) {
            mouse.addStock(10);
            System.out.println("Batch " + i + ":");
            mouse.displayItem();
        }

        mouse.removeStock(70);
        mouse.displayItem();
    }
}

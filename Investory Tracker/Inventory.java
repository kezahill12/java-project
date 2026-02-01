import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }

    public void removeItem(int id) {
        Item itemToRemove = null;

        for (Item item : items) {
            if (item.getId() == id) {
                itemToRemove = item;
                break;
            }
        }

        if (itemToRemove != null) {
            items.remove(itemToRemove);
            System.out.println("Item removed successfully!");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void updateItem(int id, int newQuantity, double newPrice) {
        for (Item item : items) {
            if (item.getId() == id) {
                item.setQuantity(newQuantity);
                item.setPrice(newPrice);
                System.out.println("Item updated successfully!");
                return;
            }
        }
        System.out.println("Item not found.");
    }
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (Item item : items) {
            item.displayItem();
        }
    }
}

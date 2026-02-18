import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Repository<User> userRepo = new Repository<>();
        userRepo.save(new User("Alice" , 001));
        userRepo.save(new User("Bob" , 002));
        userRepo.save(new User("Charlie" , 003));
        System.out.println("All Users:");
        for(User user : userRepo.findAll()){
            System.out.println(user);
        }
        System.out.println("================================");
        Repository<Product> productRepo = new Repository<>();
        productRepo.save(new Product("Laptop", 999.99, 101));
        productRepo.save(new Product("Mouse", 29.99, 102));
        productRepo.save(new Product("Keyboard", 79.99, 103));
        System.out.println("All Products:");
        for(Product product : productRepo.findAll()){
            System.out.println(product);
        }
        System.out.println("================================");
        System.out.println("Find User by Index: ");
        int userIndex = scanner.nextInt();
        userRepo.findByIndex(userIndex);
        if (userIndex >= 0 && userIndex < userRepo.findAll().size()) {
            System.out.println("User at index " + userIndex + ": " + userRepo.findAll().get(userIndex));
        } else {
            System.out.println("Invalid index for users.");
        }
        System.out.println("================================");
        System.out.println("Find Product by Index: ");
        int productIndex = scanner.nextInt();
        productRepo.findByIndex(productIndex);
        if (productIndex >= 0 && productIndex < productRepo.findAll().size()) {
            System.out.println("Product at index " + productIndex + ": " + productRepo.findAll().get(productIndex));
        } else {
            System.out.println("Invalid index for products.");
        }
        System.out.println("================================");
        System.out.println("Delete User by Index: ");
        int deleteUserIndex = scanner.nextInt();
        if (deleteUserIndex >= 0 && deleteUserIndex < userRepo.findAll().size()) {
            userRepo.delete(deleteUserIndex);
        } else {
            System.out.println("Invalid index for users.");
            
        }
        System.out.println("================================");
        System.out.println("Delete Product by Index: ");
        int deleteProductIndex = scanner.nextInt();
        if (deleteProductIndex >= 0 && deleteProductIndex < productRepo.findAll().size()) {
            productRepo.delete(deleteProductIndex);
        } else {
            System.out.println("Invalid index for products.");
        }
        System.out.println("================================");
         System.out.println("All Users After Deletion:");
        for(User user : userRepo.findAll()){
            System.out.println(user);
        }
        System.out.println("================================");
        System.out.println("All Products After Deletion:");
        for(Product product : productRepo.findAll()){
            System.out.println(product);
        }

    }
}

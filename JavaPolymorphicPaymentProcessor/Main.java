import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        PaymentProcessor processor = new PaymentProcessor();

        while (true) {

            System.out.println("\n===== Java Polymorphic Payment Processor =====");
            System.out.println("Choose payment method:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. Bitcoin");
            System.out.println("4. Exit");

            String input = reader.readLine();
            int choice = Integer.parseInt(input);

            if (choice == 1) {
                CreditCard card = new CreditCard();
                processor.processPayment(card);

            } else if (choice == 2) {
                PayPal paypal = new PayPal();
                processor.processPayment(paypal);

            } else if (choice == 3) {
                Bitcoin bitcoin = new Bitcoin();
                processor.processPayment(bitcoin);

            } else if (choice == 4) {
                System.out.println("Thank you for using the system.");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

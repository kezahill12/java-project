import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        PaymentProcessor processor = new PaymentProcessor();

        while (true) {

            System.out.println("\nChoose payment method:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. Bitcoin");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(reader.readLine());

            if (choice == 4) {
                System.out.println("Thank you for using the system!");
                break;
            }

            switch (choice) {

                case 1:
                    processor.processPayment(new CreditCard());
                    break;

                case 2:
                    processor.processPayment(new PayPal());
                    break;

                case 3:
                    processor.processPayment(new Bitcoin());
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

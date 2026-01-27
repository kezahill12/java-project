import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("******** Welcome to the Registration Portal 🎉 ********\n");

        System.out.print("Please enter your username: ");
        String username = input.nextLine().trim();

        System.out.print("Please enter your age: ");
        int age = Integer.parseInt(input.nextLine());

        System.out.print("Please enter your country: ");
        String countryInput = input.nextLine().trim();
        String password = "";
        String confirmPassword = "";

        while(true){

            System.out.print("Please enter your password: ");
            password = input.nextLine();

            System.out.print("Please confirm your password: ");
            confirmPassword = input.nextLine();

            if (password.equals(confirmPassword)) {
               break;
        }
        else{
            System.out.println("Passwords do not match❌. Please try again.\n");
        }
    }
        

        String country = "Rwanda";

         if (username.isEmpty()) {
            System.out.println("Username cannot be empty ❌");
        }
        else if (age < 18) {
            System.out.println("You must be at least 18 years old ❌");
        }
        else if (!countryInput.equalsIgnoreCase(country)) {
            System.out.println("Registration is only available for Rwanda ❌");
        }
        else {
            System.out.println("Registration successful ✅ Welcome, " + username + "!");
        }

        input.close();
    }
}

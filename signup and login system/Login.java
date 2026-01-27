import java.util.Scanner;
public class Login {
    
    public void login(User user){
        Scanner input = new Scanner(System.in);
        int attempts = 3;

        System.out.println("******** Welcome to the Login Portal 🔐 ********\n");
        while(attempts > 0){
            System.out.println("Please enter your username: ");
            String usernameInput = input.nextLine().trim();
            System.out.println("Please enter your password: ");
            String passwordInput = input.nextLine();

            if (usernameInput.equals(user.username) && passwordInput.equals(user.password)) {
                System.out.println("Login successful ✅ Welcome back, " + user.username + "!");
                break;
            }
            else{
                attempts--;
                System.out.println("Invalid username or password ❌. You have " + attempts + " attempts left.\n");
            }
        }
        if (attempts == 0) {
            System.out.println("Too many failed attempts. Your account is locked. 🔒");
        }
    }
}

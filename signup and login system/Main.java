public class Main {
    public static void main (String[] args){

        Registration reg = new Registration();
        User user = reg.register();
        System.out.println("----------------------------------------\n\n");
        if (user != null) {
            Login login = new Login();
            login.login(user);
        }
        else {
            System.out.println("System stopped due to registration failure ❌.");
        }
    }
}

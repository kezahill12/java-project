import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
            System.out.println("**********Welcome to Payment System using Interfaces🎉🎉********** ");

        while (true) {
            System.out.println("\n\n Choose payment method: \n");
            System.out.println("1. Cash \n");
            System.out.println("2. Card \n");
            System.out.println("3. Mobile Money \n");
            System.out.println("4. Bank Transfer \n");
            System.out.println("5. Exit ");
            
            int choice = input.nextInt();

            input.nextLine();

            if(choice == 5){

            System.out.println("Thank you for using the System! ");
            break;
        }

         System.out.println("Enter amount: ");

            double amount = input.nextDouble();
            
            Payment payment = null;
        switch (choice) {
            case 1:
              
            payment = new Cash();
                break;
            case 2:
               
                payment = new Card();
                break;
            case 3:
                payment = new MobileMoney();
                break;
            case 4:
                payment = new BankTransfer();
                break;
            default:
                System.out.println("Invalid Input Please try again!!");
                break;
        }
        
        
         payment.pay(amount);
        System.out.println("Payment Method: " + payment.getPaymentMethod());
        }
    }
}
class Cash implements Payment {
     
    public void pay(double amount){
    
        System.out.println("Paying " + amount + "using Cash");
    }
    public String getPaymentMethod(){
        return"Cash";
    }
}
class Card implements Payment {
     
    public void pay(double amount){
        
        System.out.println("Paying " + amount + "using Card");
    }
    public String getPaymentMethod(){
        return"Card";
    }
}
class MobileMoney implements Payment {
     
    public void pay(double amount){
        
        System.out.println("Paying " + amount + "using Mobile Money");
    }
    public String getPaymentMethod(){
        return" Mobile Money";
    }
}
class BankTransfer implements Payment {
     
    public void pay(double amount){
        
        System.out.println("Paying " + amount + "using BankTransfer");
    }
    public String getPaymentMethod(){
        return" BankTransfer";
    }
}


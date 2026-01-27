import java.util.Scanner;
public class Intro {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.next();

        System.out.println("Please enter your age : ");
        int age = input.nextInt();

        if(age < 18){
            System.out.println("Sorry " + name + ", you are not eligible to vote.");
        }
        else{
            System.out.println("Congratulations " + name + ", you are eligible to vote.");
        }
        input.close();
    }
}


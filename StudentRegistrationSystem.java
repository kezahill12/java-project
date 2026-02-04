import java.util.ArrayList;
import java.util.Scanner;
public class StudentRegistrationSystem {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.println("=========WELcome To Student Registration System🎉===============\n\n");
        System.out.println("Enter number of students to register:");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        for(int i=0; i < numberOfStudents; i ++){
            System.out.println("Enter name of student " + (i+1) + ":");
            String name = input.nextLine().trim();
            students.add(name);
            System.out.println("Student " + name + " registered successfully!\n");
        }
        System.out.println("Registered Students:");
        for(String student : students){
            System.out.println("- " + student);
        }
        System.out.println("Which Student do you want to remove?");
        String removeName = input.nextLine().trim().toLowerCase();

        boolean Found= false;
    for(int i =0; i<students.size(); i++){
        if(students.get(i).trim().toLowerCase().equals(removeName)){
            System.out.println("Student " + students.get(i) + " removed successfully.");
            students.remove(i);
            Found = true;
            break;  
        } else {
            System.out.println("Student " + students.get(i) + " not found.");
     
       }
    }
       System.out.println("Updated Student List:");
        for(String student : students){
            System.out.println("- " + student);
        }
    }
    
}

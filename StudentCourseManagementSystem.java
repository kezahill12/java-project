import java.util.*;
public class StudentCourseManagementSystem {
    public static void main(String[] args){

        ArrayList<String> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Student Course Management System!");
        System.out.println("How many students do you want to register? ");
        int numStudents = input.nextInt();

        input.nextLine();
        for (int i = 0; i < numStudents; i++){
            System.out.println("Enter name of student "  +(i +1));
            String name = input.nextLine().toLowerCase().trim();
            students.add(name);
        }
        System.out.println("Registered students: " + students);

        LinkedList<String> waitingList = new LinkedList<>();
        System.out.println("Enter name of 3 students are on waiting list");
        for(int i = 0; i < 3; i++){
            System.out.println("Enter name of student " + (i +1) + "on waiting list: ");
            String waitingStudent = input.nextLine().toLowerCase().trim();
            waitingList.add(waitingStudent);
        }
        System.out.println("Waiting list: " + waitingList);
        String movedStudent = waitingList.getFirst();
        students.add(movedStudent);
        waitingList.removeFirst();
        System.out.println("Updated students: " + students);
        System.out.println("Updated waiting list: " + waitingList);

        System.out.println("Enter name of student you want to search: ");
        String searchStudent = input.nextLine().toLowerCase().trim();
        if(students.contains(searchStudent)){
            System.out.println(searchStudent + " is registered in the system.");

        }
        else if(waitingList.contains(searchStudent)){
            System.out.println(searchStudent + " is on the waiting list.");
        }
        else{
            System.out.println(searchStudent + " is not found in the system.");
        }

        System.out.println("Enter name of student you want to remove: ");
        String removeStudent = input.nextLine().toLowerCase().trim();

        if (students.contains(removeStudent)) {
            students.remove(removeStudent);
            System.out.println(removeStudent + " has been removed from the list successfully.");

        }
        else {
            System.out.println(removeStudent + " is not found in the system.");
        }
    }
}


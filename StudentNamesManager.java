import java.util.ArrayList;
public class StudentNamesManager {
    public static void main(String[] args){

        ArrayList<String> Students = new ArrayList<>();
        Students.add("Alice");
        Students.add("Bob");
        Students.add("Charlie");
        Students.add("Diana");
        Students.add("Ethan");
        System.out.println("Initial student names:");
        for (String name : Students) {
            System.out.println(name);
        }
        Students.remove("Charlie");
        System.out.println("\nAfter removing the last student:");
        for (String name : Students) {
            System.out.println(name);

    }
    int totalStudents = Students.size();
    System.out.println("\nTotal number of students: " + totalStudents);
}
}
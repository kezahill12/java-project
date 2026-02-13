import java.util.*;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Map<Integer, String> students = new HashMap<>();

        manager.addStudent(students, 1, "Alice");
        manager.addStudent(students, 2, "Brian");
        manager.addStudent(students, 3, "Chantal");

        manager.addStudent(students, -1, "David");

        manager.addStudent(students, 4, "");

        manager.addStudent(students, 5, null);

        manager.searchStudent(students, 2);    
        manager.searchStudent(students, 99);   
        manager.searchStudent(students, -5);    

        manager.removeStudent(students, 1);  
        manager.removeStudent(students, 50);   

        Map<Integer, String> sorted = manager.sortStudents(students);
        System.out.println("\nSorted Students: " + sorted);

        manager.findStudentWithHighestId(students);
        manager.findStudentWithLowestId(students);

        manager.searchStudent(null, 1);
    }
}

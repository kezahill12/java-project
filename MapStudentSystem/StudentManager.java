import java.util.*;

public class StudentManager {

    public void addStudent(Map<Integer, String> students, int studentId, String name) {

        try {
            if (studentId <= 0) {
                throw new IllegalArgumentException("Student ID cannot be zero or negative!");
            }

            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Student name cannot be empty!");
            }

            students.put(studentId, name);
            System.out.println("Student added: ID = " + studentId + ", Name = " + name);

        } catch (NullPointerException e) {
            System.out.println("Error: Null key or value provided!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Map<Integer, String> sortStudents(Map<Integer, String> students) {

        try {
            return new TreeMap<>(students);
        } catch (NullPointerException e) {
            System.out.println("Error: Map is null!");
            return new TreeMap<>();
        }
    }

    public void searchStudent(Map<Integer, String> students, int studentId) {

        try {
            if (studentId <= 0) {
                throw new IllegalArgumentException("Student ID must be positive!");
            }

            if (students.containsKey(studentId)) {
                System.out.println("Student found: " + students.get(studentId));
            } else {
                System.out.println("Student not found.");
            }

        } catch (NullPointerException e) {
            System.out.println("Error: Map is null!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void removeStudent(Map<Integer, String> students, int studentId) {

        try {
            if (studentId <= 0) {
                throw new IllegalArgumentException("Student ID must be positive!");
            }

            if (students.remove(studentId) != null) {
                System.out.println("Student removed with ID = " + studentId);
            } else {
                System.out.println("Student not found.");
            }

        } catch (NullPointerException e) {
            System.out.println("Error: Map is null!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void findStudentWithHighestId(Map<Integer, String> students) {

        try {
            TreeMap<Integer, String> sorted = new TreeMap<>(students);
            Map.Entry<Integer, String> entry = sorted.lastEntry();
            System.out.println("Highest ID Student: " + entry.getKey() + " -> " + entry.getValue());

        } catch (NullPointerException e) {
            System.out.println("Error: Map is null!");
        }
    }

    public void findStudentWithLowestId(Map<Integer, String> students) {

        try {
            TreeMap<Integer, String> sorted = new TreeMap<>(students);
            Map.Entry<Integer, String> entry = sorted.firstEntry();
            System.out.println("Lowest ID Student: " + entry.getKey() + " -> " + entry.getValue());

        } catch (NullPointerException e) {
            System.out.println("Error: Map is null!");
        }
    }
}

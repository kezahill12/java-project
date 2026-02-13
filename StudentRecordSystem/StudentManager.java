import java.io.*;
import java.util.*;

public class StudentManager {

    private List<Student> students = new ArrayList<>();

    public void loadFromFile(String filename) {

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");

                if (parts.length != 4) {
                    System.out.println("Invalid data format: " + line);
                    continue;
                }

                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                int age = Integer.parseInt(parts[2].trim());
                int score = Integer.parseInt(parts[3].trim());

                students.add(new Student(id, name, age, score));
            }

            if (students.isEmpty()) {
                System.out.println("File is empty.");
            } else {
                System.out.println("Loaded " + students.size() + " students from the file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading file.");
        }
    }

    public void saveToFile(String filename) {

        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {

            for (Student s : students) {
                pw.println(s.toFileString());
            }

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    public void displayAll() {

        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public double getAverageScore() {

        int sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }
        return (double) sum / students.size();
    }

    public Student getTopStudent() {

        Student top = students.get(0);

        for (Student s : students) {
            if (s.getScore() > top.getScore()) {
                top = s;
            }
        }
        return top;
    }

    public Student getLowestStudent() {

        Student low = students.get(0);

        for (Student s : students) {
            if (s.getScore() < low.getScore()) {
                low = s;
            }
        }
        return low;
    }
    public void displayPassed() {

        System.out.println("\nStudents who passed:");
        boolean found = false;

        for (Student s : students) {
            if (s.getScore() >= 60) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }

    public void displayFailed() {

        System.out.println("\nStudents who failed:");
        boolean found = false;

        for (Student s : students) {
            if (s.getScore() < 60) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added.");
    }

    public void updateScore(int id, int newScore) {

        for (Student s : students) {
            if (s.getId() == id) {
                s.setScore(newScore);
                System.out.println("Score updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void sortByScore() {
        students.sort(Comparator.comparingInt(Student::getScore));
        System.out.println("Students sorted by score.");
    }
}

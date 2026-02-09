import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("students.txt");

            System.out.println("Enter 5 student names:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter name of student " + (i + 1) + ": ");
                String name = input.nextLine().trim();
                writer.write(name + "\n");
            }

            writer.close();
            System.out.println("\nStudents saved successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

    
        try {
            File file = new File("students.txt");
            Scanner reader = new Scanner(file);

            System.out.println("\nReading students from file:");

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

import java.util.*;

public class TaskManager {

    private List<String> arrayTasks;
    private List<String> linkedTasks;

    public TaskManager() {
        arrayTasks = new ArrayList<>();
        linkedTasks = new LinkedList<>();
    }

    public void addTask(String task) throws InvalidTaskException {

        if (task == null || task.trim().isEmpty()) {
            throw new InvalidTaskException("Invalid task! Task cannot be empty.");
        }

        arrayTasks.add(task);
        linkedTasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void displayTasks() {
        System.out.println("\nTasks: " + arrayTasks);
    }

    public void sortTasks() {
        Collections.sort(arrayTasks);
        Collections.sort(linkedTasks);
        System.out.println("Tasks sorted alphabetically.");
    }

    public void searchTask(String task) {

        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid task input!");
        }

        int index = arrayTasks.indexOf(task);

        if (index != -1) {
            System.out.println("Task found at index: " + index);
        } else {
            System.out.println("Task not found.");
        }
    }

    public void removeTask(String task) {

        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid task input!");
        }

        boolean removed = arrayTasks.remove(task);
        linkedTasks.remove(task);

        if (removed) {
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Task not found.");
        }
    }

    public void findLongestTask() {

        if (arrayTasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        String longest = arrayTasks.get(0);

        for (String t : arrayTasks) {
            if (t.length() > longest.length()) {
                longest = t;
            }
        }

        System.out.println("Longest task: " + longest);
    }

    public void getTaskByIndex(int index) {

        try {
            String task = arrayTasks.get(index);
            System.out.println("Task at index " + index + ": " + task);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
        } finally {
            System.out.println("Index access attempt finished.");
        }
    }
}

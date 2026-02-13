public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        try {
            manager.addTask("Study Java");
            manager.addTask("Do assignment");
            manager.addTask("Buy groceries");
            manager.addTask("Go jogging");

            manager.addTask("");

        } catch (InvalidTaskException e) {
            System.out.println(e.getMessage());
        }

        manager.displayTasks();
        manager.sortTasks();
        manager.displayTasks();

        try {
            manager.searchTask("Do assignment");
            manager.searchTask("Sleep");
            manager.searchTask("");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            manager.removeTask("Buy groceries");
            manager.removeTask("Cook");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        manager.findLongestTask();

        manager.getTaskByIndex(1); 
        manager.getTaskByIndex(10); 
    }
}

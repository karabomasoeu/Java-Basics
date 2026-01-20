+[import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean running = true;
        
        System.out.println("=========================================");
        System.out.println("    Welcome to your to-do list manager!");
        System.out.println("=========================================");
        System.out.println();

        while (running) {
            displayMenu();
            int choice = getUserChoice();
            System.out.println();
            
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    markTaskComplete();
                    break;
                case 5:
                    clearAllTasks();
                    break;
                case 6:
                    running = false;
                    System.out.println("Thank you for using to-do list manager!");
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1-6.");
            }
            
            System.out.println();
        }
        scanner.close();
    }
    private static void displayMenu() {
        System.out.println("========================================");
        System.out.println("              MAIN MENU");
        System.out.println("========================================");
        System.out.println("1. Add a new task");
        System.out.println("2. View all tasks");
        System.out.println("3. Remove a task");
        System.out.println("4. Mark task as complete");
        System.out.println("5. Clear all tasks");
        System.out.println("6. Exit");
        System.out.println("========================================");
        System.out.print("Enter your choice (1-6): ");
    }
    private static int getUserChoice() {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine(); // Clear invalid input
                return -1;
            } finally {
                scanner.nextLine(); // Clear the newline
            }
        }
    private static void addTask() {
        System.out.println("--- Add New Task ---");
        System.out.print("Enter task description: ");
        String task = scanner.nextLine();
        
        if (task.trim().isEmpty()) {
            System.out.println("Error: Task cannot be empty!");
        } else {
            tasks.add(task);
            System.out.println("✓ Task added successfully!");
            System.out.println("Total tasks: " + tasks.size());
        }
    }
    private static void addTask() {
        System.out.println("--- Add New Task ---");
        System.out.print("Enter task description: ");
        String task = scanner.nextLine();
        
        if (task.trim().isEmpty()) {
            System.out.println("Error: Task cannot be empty!");
        } else {
            tasks.add(task);
            System.out.println("✓ Task added successfully!");
            System.out.println("Total tasks: " + tasks.size());
        }
    }
    private static void viewTasks() {
        System.out.println("--- Your To-Do List ---");
        
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet! Your list is empty.");
            System.out.println("Add a task to get started.");
        } else {
            System.out.println("You have " + tasks.size() + " task(s):");
            System.out.println();
            
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    private static void removeTask() {
        System.out.println("--- Remove Task ---");
        
        if (tasks.isEmpty()) {
            System.out.println("No tasks to remove! Your list is empty.");
            return;
        }
    viewTasks();
        System.out.println();
        System.out.print("Enter task number to remove (1-" + tasks.size() + "): ");
        
        try {
            int taskNumber = scanner.nextInt();
            scanner.nextLine(); 
            
            if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                String removedTask = tasks.remove(taskNumber - 1);
                System.out.println("Removed: \"" + removedTask + "\"");
                System.out.println("Remaining tasks: " + tasks.size());
            } else {
                System.out.println("Error: Invalid task number!");
            }
        } catch (Exception e) {
            scanner.nextLine(); 
            System.out.println("Error: Please enter a valid number!");
        }
    }
    private static void markTaskComplete() {
        System.out.println("--- Mark Task Complete ---");
        
        if (tasks.isEmpty()) {
            System.out.println("No tasks to mark complete. Your list is empty.");
            return;
        }
    System.out.print("Are you sure you want to delete all " + tasks.size() + " task(s)? (yes/no): ");
        String confirmation = scanner.nextLine().toLowerCase();
        
        if (confirmation.equals("yes") || confirmation.equals("y")) {
            int count = tasks.size();
            tasks.clear();
            System.out.println("✓ All " + count + " task(s) have been deleted!");
        } else {
            System.out.println("Clear operation cancelled.");
        }
    }
}

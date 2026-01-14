import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean running = true;
        
        System.out.println("========================================");
        System.out.println("    Welcome to your to-do list manager!");
        System.out.println("========================================");
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

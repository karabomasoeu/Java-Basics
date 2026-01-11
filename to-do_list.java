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
                    System.out.println("Invalid choice! Please enter number between 1-6.");
            }
            
            System.out.println();
        }

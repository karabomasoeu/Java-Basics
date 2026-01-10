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

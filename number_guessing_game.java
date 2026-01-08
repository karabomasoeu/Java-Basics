import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

         Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        System.out.println("  Welcome to Number Guessing Game!");
        System.out.println("================================");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        System.out.println();

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
    

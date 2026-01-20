import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

         Scanner scanner = new Scanner(System.in);
        
        System.out.println("====================================");
        System.out.println("  Welcome to Number Guessing Game!");
        System.out.println("====================================");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        System.out.println();

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

             if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100!");
                attempts--; 
                System.out.println();
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
                System.out.println();
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try a lower number.");
                System.out.println();
            } else {
                System.out.println("================================");
                System.out.println("🎉 Congratulations!");
                System.out.println("================================");
                System.out.println("The number was: " + targetNumber);
                System.out.println("You guessed it in " + attempts + " attempts!");
                System.out.println();

                 if (attempts <= 5) {
                    System.out.println("Excellent!");
                } else if (attempts <= 10) {
                    System.out.println("Good job!");
                } else {
                    System.out.println("You made it!");
                }
            }
        }
        scanner.close();
        
        System.out.println();
        System.out.println("Thanks for playing!");
    }
}

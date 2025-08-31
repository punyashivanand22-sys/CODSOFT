import java.util.Random;
import java.util.Scanner;

public class SimpleNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;   // Track rounds won
        boolean playAgain;

        System.out.println("🎮 Welcome to the Number Guessing Game! 🎮");

        do {
            int numberToGuess = rand.nextInt(100) + 1; // Random number between 1-100
            int attempts = 0;
            int maxAttempts = 7; // You can change this limit
            boolean guessedCorrectly = false;

            System.out.println("\nI have chosen a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("✅ Correct! You guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    score++; // Increment score if guessed correctly
                    break;
                } else if (guess > numberToGuess) {
                    System.out.println("📉 Too high! Try again.");
                } else {
                    System.out.println("📈 Too low! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("❌ Out of attempts! The number was: " + numberToGuess);
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("\n🎯 Game Over! Your final score is: " + score + " rounds won.");
        System.out.println("Thanks for playing!");
        sc.close();
    }
}
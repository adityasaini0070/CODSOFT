package Task1_NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            int rounds = 0, score = 0;
            do {
                int number = rand.nextInt(100) + 1;
                int attempts = 0, maxAttempts = 5;
                System.out.println("Guess the number between 1 and 100!");

                while (attempts < maxAttempts) {
                    System.out.print("Enter guess: ");
                    int guess = sc.nextInt();
                    attempts++;

                    if (guess == number) {
                        System.out.println("Correct! You guessed in " + attempts + " tries.");
                        score++;
                        break;
                    } else if (guess > number) {
                        System.out.println("Too high!");
                    } else {
                        System.out.println("Too low!");
                    }
                }

                rounds++;
                System.out.println("The number was: " + number);
                System.out.println("Score: " + score + "/" + rounds);

                System.out.print("Play again? (y/n): ");
            } while (sc.next().equalsIgnoreCase("y"));
        }
    }
}

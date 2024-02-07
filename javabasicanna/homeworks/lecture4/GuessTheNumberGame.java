package javabasicanna.homeworks.lecture4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have chosen a number between " + min + " and " + max + ".");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (attempts >= 3) {
                System.out.println("You have reached the maximum number of attempts.");
                System.out.println("The number I chose was: " + randomNumber);
                break;
            }
        }

        scanner.close();
    }
}

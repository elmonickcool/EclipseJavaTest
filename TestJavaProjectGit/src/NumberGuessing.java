import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int lowerBound =1;
		int upperBound = 100;
		int secretNumber = r.nextInt(upperBound - lowerBound + 1) + lowerBound;
		
		System.out.println("Welcome to Number Guessing Game!");
		System.out.println("Enter a number between "+lowerBound+" to "+upperBound);
		
		int userGuess;
		int attempts = 0;
		int maxAttempts = 10;
		
		while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            userGuess = s.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("Too low! Try higher than "+ userGuess);
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try lower than "+ userGuess);
            } else {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
                break; // Exit the loop if the guess is correct
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry! You've reached the maximum number of attempts. The correct number was: " + secretNumber);
        }
		
		s.close();

	}

}

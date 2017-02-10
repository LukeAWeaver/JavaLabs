import java.util.*;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// secret number
		int answer = 47;
		System.out.println("Welcome to the number guesing game.");
		System.out.println("Guess a number: ");
		Scanner guess = new Scanner(System.in);
		int guesses = guess.nextInt();
		do {
			// guess is too low
			if (guesses < answer) {
				System.out.println("Sorry, your guess is too low.");
				guesses = guess.nextInt();
				// guess is too high
			} else {
				System.out.println("sorry, your guess is to high.");
				guesses = guess.nextInt();
			}
		} while (guesses != answer);
		// user exits loop and guesses correctly
		System.out.println("You win!");
	}

}

import java.util.*;

public class WordGuessingGame {

	public static void main(String[] args) {
		String fruit = "fruit";
		System.out.println("Welcome to the word guessing game.");
		System.out.print("Guess a word: ");
		Scanner guess = new Scanner(System.in);
		String guesses = guess.next();
		// if they guess incorrectly
		while (!guesses.equals(fruit)) {
			System.out.print("Incorrect. Guess again: ");
			guesses = guess.next();
		}
		// exiting the loop
		System.out.println("You win!");
	}

}

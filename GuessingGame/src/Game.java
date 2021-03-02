import java.util.Scanner;

public class Game {

	//Public class variables so that they don't have to be passed everywhere
	public
		static int numToGuess;
		static int guess;
		static int numGuesses;
		static Scanner sc;
		
	public static void main(String[] args) {
		System.out.println("Welcome to a Number Guessing game");
		//Plays the game
		playGame();
	}

	//Assign values to class variables
	public static void initGame() {
		sc = new Scanner(System.in);
		numToGuess = (int)(Math.random() * 100) + 1;
		guess = 0;
		numGuesses = 0;
	}

	//Plays the game
	public static void playGame() {
		boolean gameOver = false;
		
		initGame();
		System.out.println("I am thinking of a number from 1 to 100, try to guess it!");
		while(!gameOver) {
			getGuess();
			gameOver = checkGuess();
		}
		endGame();
	}
	
	//Prints end statements and asks if the player would like to play again
	public static void endGame() {
		//Print ending statement
		if(numGuesses > 7) {
			System.out.println("What took you so long? Maybe you should take some lessons.");
		}
		else if(numGuesses > 3) {
			System.out.println("Not too bad! You've got some potential.");
		}
		else {
			System.out.println("Great work! You are a mathematical wizard!");
		}
		
		//Asks if the player would like to play again
		System.out.println("Would you like to play again? (y/n)");
		String input = sc.next();
		//Makes sure y or n were entered
		while(!validateInputString(input)) {
			System.out.println("Improper input, chose y or n");
			input = sc.next();
		}
		
		if(input.equalsIgnoreCase("y")) {
			System.out.println("Let's play again!");
			playGame();
		}
		else {
			System.out.println("Goodbye!");
		}
		
		
	}
	
	public static void getGuess() {
		int input = 0;
		System.out.println("Please enter your guess (1-100)");
		while((input > 100) || (input < 1)){
			input = validateInputInt();
		}
		
		guess = input;
		numGuesses++;
	}
	
	
	
	//Checks the guess and returns if the game has ended
	public static boolean checkGuess() {
		if(numToGuess == guess) {
			System.out.println("Congratulations, you guessed the number in " + numGuesses);
			return true;
		}
		else if((numToGuess - guess) > 10) {
			System.out.println("Way too low!");
		}
		else if((numToGuess - guess) < -10) {
			System.out.println("Way too high!");
		}
		else if((numToGuess - guess) > 0) {
			System.out.println("Too low!");
		}
		else if((numToGuess - guess) < 0) {
			System.out.println("Too high!");
		}
		return false;
	}
	
	//Ensures that the string entered equals y or n
	public static boolean validateInputString(String input) {
		
		if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	//Makes sure that whatever is entered is an integer
	public static int validateInputInt() {
		
		int input = 0;
		while(!(sc.hasNextInt())) {
			System.out.println("Please enter an integer from 1 - 100");
			//clean input buffer
			String garbage  = sc.next();
			System.out.println(garbage + " is invalid input");
		}
		input = sc.nextInt();
		return input;
	}
	
}

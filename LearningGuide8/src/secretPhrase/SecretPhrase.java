package secretPhrase;
import java.util.Scanner;

public class SecretPhrase {
	private static int guesses;
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		
		//Initializes the 2 arrays of characters
		String phrStr = selectPhrase();
		char[] phrase = phrStr.toCharArray();
		char [] display = new char[phrase.length];
		for(int i = 0; i < phrase.length; i++) {
			if(phrase[i] != ' ') {
				display[i] = '*';
			}
		}
		
		System.out.println("Welcome to Hangman/Secret Phrase");
		printCharArray(display);
		
		while(!gameFinished(display)) {
			guessLetter(getGuess(), phrase, display);
			printCharArray(display);
		}
		System.out.println("Congratulations, you completed the phrase in " + guesses + " guesses.");
	}
	
	//Gets a guess from the console
	public static char getGuess() {
		
		System.out.println("Enter what letter you would like to guess:");
		char guess = ' ';
		String g = sc.next();
		guess = g.charAt(0);
		
		return guess;
	}
	
	//Assigns any changes to the display array necessary based on the guess
	public static void guessLetter(char c, char[] phr, char[] disp) {
		guesses++;
		
		for(int i = 0; i < phr.length; i++) {
			//check to see if the input is the same as a character at an index, ensuring to check for lower/upper case
			if((phr[i] == c) || (phr[i] == (char)(c+32)) || (phr[i] == (char)(c-32))) {
				disp[i] = phr[i];
			}
		}
	}

	
	//Returns true if the display has no more *s
	public static boolean gameFinished(char[] disp) {
		for(char c : disp) {
			if(c == '*') {
				return false;
			}
		}
		return true;
	}
	
	//Selects the phrase to be guessed at runtime
	public static String selectPhrase() {
		int selection = (int)(Math.random()*10); //range 0-9
		System.out.println(selection);
		String[] phrases = {
				"Data Science for life",
				"Brown cows and lazy dogs",
				"Lorem ipsum dolor sit amet",
				"Dordt is number one in engagement",
				"Maybe no punctuation",
				"Umlauts are great",
				"No time for games",
				"Five Gum is the goat",
				"Quomodo te habes",
				"How do you do" };
		
		return phrases[selection];
	}
	
	//Prints an array of characters
	public static void printCharArray(char[] ca) {
		for(char c : ca) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	
}

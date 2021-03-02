package RoshamboProj;
import java.util.Scanner;

public class RoshamboApp {
	
	private static int wins;
	private static int losses;
	private static String playerName;
	private static Player opponent;
	private static Scanner sc;
	
	public static void main(String args[]) {
		System.out.println("Welcome to Roshambo!");
		sc = new Scanner(System.in);
		getPlayerName();
		getOpponent();
		
		//plays the game
		String[] contOptions = {"y","n"};
		boolean contGame = true;
		while(contGame) {
			round();
			
			System.out.println("Would you like to continue? (y/n)");
			String cont = sc.next();
			while(!validateInputString(cont,contOptions)) {
				sc.nextLine();
				System.out.println("Invalid input, please try again");
				cont = sc.next();
			}
			if(cont.equalsIgnoreCase("n")) {
				contGame = false;
			}
		}
		displayScores();
		
	}
	
	//gets the name of the player
	public static void getPlayerName() {
		System.out.println("Please enter your name");
		playerName = sc.next();
	}
	
	//gets the players choice
	public static Roshambo getPlayerChoice() {
		System.out.println("Choose Rock, Paper, or Scissors: (r/p/s)");
		String[] options = {"r","p","s"};
		String choice = sc.next();
		while(!validateInputString(choice,options)) {
			sc.nextLine();
			System.out.println("Invalid input, please try again");
			choice = sc.next();
		}
		
		if(choice.equalsIgnoreCase("r")) {
			return Roshambo.ROCK;
		}
		else if(choice.equalsIgnoreCase("p")) {
			return Roshambo.PAPER;
		}
		else {
			return Roshambo.SCISSORS;
		}
		
	}
	
	//play a round of the game
	public static void round() {
		Roshambo p = getPlayerChoice();
		Roshambo c = opponent.getRoshambo();
		System.out.println(playerName + " chose " + p.toString());
		System.out.println(opponent.getName() + " chose " + c.toString());
		System.out.println(checkWinner(p,c));
	}
	
	//Check who won the match, p(layer) or c(omputer)
	public static String checkWinner(Roshambo p, Roshambo c) {
		if(p.equals(c)) {
			return "Tie!";
		}
		
		//player's paper will beat rock and lose to scissors
		else if(p.equals(Roshambo.PAPER)) {
			if(c.equals(Roshambo.ROCK)) {
				wins++;
				return playerName + " won!";
			}
			else {
				losses++;
				return opponent.getName() + " won!";
			}
		}
		
		//player's rock will beat scissors and lose to paper
		else if(p.equals(Roshambo.ROCK)) {
			if(c.equals(Roshambo.SCISSORS)){
				wins++;
				return playerName + " won!";
			}
			else {
				losses++;
				return opponent.getName() + " won!";
			}
		}
		
		//player's scissors will beat paper and lose to rock 
		else if(p.equals(Roshambo.SCISSORS)) {
			if(c.equals(Roshambo.PAPER)) {
				wins++;
				return playerName + " won!";
			}
			else {
				losses++;
				return opponent.getName() + " won!";
			}
		}
		return null;
	}
	
	//check a string against an array of options
	public static boolean validateInputString(String input, String[] validOptions) {
		boolean valid = false;
		
		for(int i = 0; i < validOptions.length; i++) {
			if( input.equalsIgnoreCase(validOptions[i])) {
				valid = true;
			}
		}
		return valid;
		
	}
	
	//Gets the opponent that the human would like to play against
	public static void getOpponent() {
		System.out.println("Would you like to play Bart or Lisa (b/l)?");
		
		String choice = sc.next();
		String[] options = {"b","l"};
		while (!validateInputString(choice,options)) {
			sc.nextLine();
			System.out.println("Invalid input, please select Bart or Lisa (b/l)");
			choice = sc.next();
		}
		
		if(choice.equalsIgnoreCase("b")) {
			opponent = new Bart();
		}
		else {
			opponent = new Lisa();
		}
	}
	
	//displays the scores of the human player
	public static void displayScores() {
		System.out.println(playerName + " won " + wins + " games");
		System.out.println(playerName + " lost " + losses + " games");
	}
	
	
}

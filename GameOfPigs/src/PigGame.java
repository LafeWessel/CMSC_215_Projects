
import java.util.Scanner;

public class PigGame {
	public static void main(String[] args) {
		//Plays the game
		playGame();
	}
	
	//Plays the game and outputs the scores at the end of each turn and the game
	public static void playGame() {
		
		int humanScore  = 0;
		int compScore = 0;
		
		//Loops while both of the scores are less than 100
		while ((humanScore < 100) && (compScore < 100)) {
			humanScore += humanTurn();
			
			//Will cut the game off if the player passes 100
			if(humanScore < 100) {
				compScore += computerTurn();	
			}
			System.out.println("Player total: " + humanScore);
			System.out.println("Computer total: " + compScore);
		}
		
		if(humanScore >= 100) {
			System.out.println("The player has won!");
		}
		else {
			System.out.println("The computer has won!");
		}
		
		System.out.println("Ending player score: " + humanScore);
		System.out.println("Ending computer score: " + compScore);
	}
	
	//Returns the score from the player's turn
	public static int humanTurn() {
		System.out.println("Your turn");
		int total = 0;
		int roll = rollDie();
		System.out.println("You rolled a " + roll + "!");
		
		//checks for the first roll then loops
		if(checkRoll(roll)) {
			total +=roll;
			//While the player would like to continue rolling
			while(rollAgain()) {
				roll = rollDie();
				System.out.println("You rolled a " + roll + "!");
				if(!checkRoll(roll)) {
					return 0;
				}
				else {
					total += roll;
				}
				System.out.println("Your turn total is: " + total);
			}
		}
		else {
			
			return 0;
		}
		return total;
	}
	
	//Checks to see if the human player would like to roll again or hold
	public static boolean rollAgain()
	{
		Scanner sc = new Scanner(System.in);
		char input = 'a';
		System.out.println("Would you like to roll again (r) or hold (h)?");
		//gets and checks input
		boolean goodInput = false;
		while(!goodInput) {
			if(sc.hasNext()) {
				input = sc.nextLine().charAt(0);
			}
			//Checks to make sure the input is either an r or an h
			if((input == 'r') || (input == 'h')) {
				goodInput = true;
			}
			else {
				System.out.println("Invalid input, try again");
				sc.nextLine();
			}
		}
		
		if(input == 'r') {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//Returns the score from the computer's turn
	public static int computerTurn() {
		int total = 0;
		while(total < 20) {
			int roll = rollDie();
			System.out.println("Computer rolled a: " + roll);
			//If >1 is rolled, add it to the total and loop again
			if(checkRoll(roll)) {
				total += roll;
			}
			//If a 1 is rolled, return 0 immediately
			else
			{
				return 0;
			}
		}
		return total;
	}
	
	//Checks the roll and returns false if it is 1
	public static boolean checkRoll(int dieRoll) {
		if(dieRoll < 2) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//Returns a number from 1 to 6
	public static int rollDie() {
		return (int)(Math.random() * 6) + 1;
	}
	
}

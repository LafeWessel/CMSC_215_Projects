import java.util.Scanner;

public class Craps {
	
	public static int point;
	public static int roll;
	public static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		roll = 0;
		point = 0;
		String cont = "y";
		Dice d = new Dice();
		System.out.println("Welcome to Craps!");
		d.roll();
		roll = d.getSum();
		d.printRoll();
		printTerms(d);
		int gameOver  = checkFirst();
		point = roll;
		
		if(gameOver == 0) {
			System.out.println("Would you like to roll again?");
			cont = sc.next();	
		}
		
		while(cont.equalsIgnoreCase("y") && !(Math.abs(gameOver) == 1)) {
			d.roll();
			roll = d.getSum();
			d.printRoll();
			printTerms(d);
			gameOver = checkRoll();
			point = roll;
			
			if(gameOver == 0) {
				System.out.println("Would you like to roll again?");
				cont = sc.next();	
			}
		}
	}
	
	//Shows output for certain rolls
	public static void printTerms(Dice d) {
		if(roll == 2) {
			System.out.println("Snake Eyes!");
		}
		else if(roll == 12) {
			System.out.println("Box Cars!");
		}
		else if(roll == 11) {
			System.out.println("Yo!");
		}
		else if(roll == 7) {
			System.out.println("Craps!");
		}
	}
	
	public static int checkFirst() { //checks on the first roll to see if the game is over
		if((roll == 3) || (roll == 2) || (roll == 12)) {
			System.out.println("You lost!");
			return -1;
		}
		else if((roll == 7) || (roll == 11)) {
			System.out.println("You won!");
			return 1;
		}
		else {
			return 0;
		}		
	}
	
	public static int checkRoll() { // checks on each roll to see if the game is over
		if(roll == 7) {
			System.out.println("Game over, you lost!");
			return -1;
		}
		else if(roll == point) {
			System.out.println("You won!");
			return 1;
		}
		else {
			return 0;
		}
	}
}

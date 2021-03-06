package FiveDice;
import java.util.Scanner;

public class FiveDiceApp {
	private static Die[] player;
	private static Die[] computer;
	private static Scanner sc;
	
	public static void main(String[] args) {
		player = new Die[5];
		computer = new Die[5];
		for(int i = 0; i < 5; i++) {
			player[i] = new Die();
			computer[i] = new Die();
		}
		
		sc = new Scanner(System.in);
		System.out.println("Welcome to Five Dice");
		boolean cont = true;
		
		//Plays the game
		while(cont) {
			playRound();
			System.out.println("Would you like to continue?(y/n)");
			if(sc.next().equalsIgnoreCase("n")){
				cont = false;
			}
		}
	}
	
	//Assigns values, then compares the results
	public static void playRound() {
		rollValues();
		
		System.out.println("Player Rolls");
		printArray(player);
		System.out.println("Computer Rolls");
		printArray(computer);
		compareValues();
	}
	
	//Assigns 1-6 to each item in the array passed in
	public static void rollValues() {
		for(int i = 0; i < player.length; i++) {
			player[i].roll();
		}
		for(int i = 0; i < computer.length; i++) {
			computer[i].roll();
		}
	}
	
	//Compares the values between the player and computer arrays to see which is greater
	public static void compareValues() {
		int[] p = {0,0,0,0,0,0};
		int[] c = {0,0,0,0,0,0};
		
		getValDistrib(p,player);
		getValDistrib(c,computer);
		
		System.out.println("Player distribution");
		printDist(p);
		System.out.println("Computer distribution");
		printDist(c);
		
		int[] playerVal = {-1,-1};
		int topVal = 0;
		String outcome = "";
		
		for(int i = 0; i < p.length; i++) {
			//If player's is greater than computer and also greater than the greatest number of rolls
			if(p[i] > c[i] && p[i] >= playerVal[1]) {
				playerVal[0] = 0;
				playerVal[1] = p[i];
				topVal = i;
			}
			//if computer's is greater than the player and also greater than the greatest number of rolls
			else if(p[i] < c[i] && c[i] >= playerVal[1]) {
				playerVal[0] = 1;
				playerVal[1] = c[i];
				topVal = i;
			}
		}
		
		if(playerVal[0] == 0) {
			System.out.println("The player has won!");
		}
		else if(playerVal[0] == 1){
			System.out.println("The computer won!");
		}
		else {
			System.out.println("Something went wrong!");
		}
		
		outcome = "Won with " + (playerVal[1]) + " " + (topVal+1) + "s";
		System.out.println(outcome);
	}
	
	//assigns the correct number of results in the vals array to the corresponding location in the dist array
	public static void getValDistrib(int[] dist, Die[] vals) {
		for(int i = 0; i < vals.length;i++) {
			dist[vals[i].getNum()-1]++;
		}
	}
	
	//Prints an array of integers
	public static void printArray(Die[] a) {
		for(Die i : a) {
			System.out.print(i.getNum() + " ");
		}
		System.out.println();
	}
	
	//Prints the distribution of integers
	public static void printDist(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print((i+1) + ":" + a[i] + ", ");
		}
		System.out.println();
	}
}

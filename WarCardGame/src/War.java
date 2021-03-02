import java.util.Scanner;
public class War {
	
	private static Card pc;//player card
	private static Card cc;//computer card
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		cc = new Card();
		pc = new Card();
		//Plays a turn while the player would like to continue playing
		while(cont.equalsIgnoreCase("y")) {
			
			playTurn();
			
			
			System.out.println("Player's card:\n" + pc.printCard() + 
					"\nComputer's card:\n" + cc.printCard());
			if(compareCards(pc,cc) == 1) {
				System.out.println("The player has won!");
			}
			else if(compareCards(pc,cc) == -1){
				System.out.println("The computer has won!");
			}
			else {
				System.out.println("The cards tied!");
			}
			System.out.println("Would you like to play again?(y/n)");
			cont = sc.next();
		}
	}
	
	//returns 1 if c1 > c2, -1 if c1 < c2, and 0 if c1 = c2
	public static int compareCards(Card c1, Card c2) { 
		if(c1.getValue() > c2.getValue()) {
			return 1;
		}
		else if(c1.getValue() < c2.getValue()) {
			return -1;
		}
		else {
			return 0;
		}
			
	}
	
	//Gets random new cards and makes sure they are not identical
	public static void playTurn() {
		getRandomCard(cc);
		getRandomCard(pc);
		if(checkEqual(cc,pc)) {
			playTurn();
		}
	}
	
	//Returns a card with random values
	public static void getRandomCard(Card c) {
		int index = (int)(Math.random() *4);
		char[] suits = {'s','h','d','c'};
		c.setSuit(suits[index]);
		//System.out.println("rand suit: " + suits[index]);
		int num = (int)(Math.random()*13) + 1;
		c.setValue(num);
		//System.out.println("rand val: " + num);
	}
	
	public static boolean checkEqual(Card c1, Card c2) { //Checks to see if the cards are equal
		if(c1.getSuit() == c2.getSuit()) {
			return true;
		}
		else if(c1.getValue() == c2.getValue()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}

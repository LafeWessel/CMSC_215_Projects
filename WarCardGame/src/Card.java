
public class Card {
	private char suit;
	private int value;
	
	Card(){
		suit = 's';
		value = 1;
	}
	
	//Constructor that ensure that the values passed in are valid
	Card(char suit, int value){
		if(!((suit == 's') || (suit == 'h') || (suit == 'd') || (suit == 'c'))) {
			suit = 's';
			System.out.println("Invalid suit entered, set to spades");
		}
		if((value > 13) || (value < 1)) {
			System.out.println("Invalid value entered, set to 1");
			value = 1;
		}
		this.suit = suit;
		this.value = value;
	}
	
	public char getSuit() {
		return suit;
	}
	public int getValue() {
		return value;
	}
	
	public void setSuit(char suit) {
		this.suit = suit;
	}		
	public void setValue(int value) {
		this.value = value;
	}
	
	public String printCard() {
		return "Suit: " + suit + "\tValue: " + value;
	}
	
}

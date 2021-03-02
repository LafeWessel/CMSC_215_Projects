package WarGame;

public class Card {
	private int value;
	private Suit suit; 
	
	Card(){
		value = 1;
		suit = Suit.SPADES;
	}
	
	Card(Card c){
		value = c.getValue();
		suit = c.getSuit();
	}
	
	//Constructor that ensure that the values passed in are valid
	Card(Suit suit, int value){
		if((value > 13) || (value < 1)) {
			System.out.println("Invalid value entered, set to 1");
			value = 1;
		}
		this.suit = suit;
		this.value = value;
	}
	
	//Accessors
	public Suit getSuit() {
		return suit;
	}
	public int getValue() {
		return value;
	}
	
	//Mutators
	public void setSuit(Suit suit) {
		this.suit = suit;
	}		
	public void setValue(int value) {
		this.value = value;
	}
	
	//Returns the card as a string
	public String toString() {
		String s = "";
		switch(value) {
		case(1):
			s += "Ace of ";
			break;
		case(2):
			s += "Two of ";
			break;
		case(3):
			s += "Three of ";
			break;
		case(4):
			s += "Four of ";
			break;
		case(5):
			s += "Five of ";
			break;
		case(6):
			s += "Six of ";
			break;
		case(7):
			s += "Seven of ";
			break;
		case(8):
			s += "Eight of ";
			break;
		case(9):
			s += "Nine of ";
			break;
		case(10):
			s += "Ten of ";
			break;
		case(11):
			s += "Jack of ";
			break;
		case(12):
			s += "Queen of ";
			break;
		case(13):
			s += "King of ";
			break;
		}
		
		if(suit == Suit.CLUBS) {
			s += "Clubs";
		}
		else if(suit == Suit.DIAMONDS) {
			s += "Diamonds";
		}
		else if(suit == Suit.HEARTS) {
			s += "Hearts";
		}
		else if(suit == Suit.SPADES) {
			s += "Spades";
		}

		return s;
	}
	
	
}

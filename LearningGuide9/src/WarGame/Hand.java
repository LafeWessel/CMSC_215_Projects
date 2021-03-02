package WarGame;
import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> hand;
	
	Hand(){
		hand = new ArrayList<Card>();
	}
	
	Hand(ArrayList<Card> hand){
		this.hand = hand;
	}
	
	//Sets the arrayList of cards
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	//Returns the arrayList of cards
	public ArrayList<Card> getHand(){
		return hand;
	}
	
	//Adds a card to the arraList of cards
	public void addCard(Card c) {
		hand.add(c);
	}
	
	//Returns a random card and removes that card from the list of cards
	public Card drawCard() {
		int i = (int)(Math.random() * hand.size());
		Card c = hand.get(i);
		hand.remove(i);
		return c;
	}
	
	public void printHand() {
		int i = 1;
		for(Card c : hand) {
			System.out.println(i + ": " + c.toString());
			i++;
		}
	}
	
}

package WarGame;
import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	Deck() {
		populateDeck();
	}
	
	//Creates a full, normal deck of cards, minus jokers
	private void populateDeck() {
		for(int i = 1; i <= 13; i++) {
			Card c = new Card(Suit.CLUBS,i);
			cards.add(c);
		}
		for(int i = 1; i <= 13; i++) {
			Card c = new Card(Suit.DIAMONDS,i);
			cards.add(c);
		}
		for(int i = 1; i <= 13; i++) {
			Card c = new Card(Suit.HEARTS,i);
			cards.add(c);
		}
		for(int i = 1; i <= 13; i++) {
			Card c = new Card(Suit.SPADES,i);
			cards.add(c);
		}
	}
	
	//Returns a card at an index
	public Card getCardAtIndex(int index) {
		return cards.get(index);
	}
	
	//Returns a card and removes it from the arrayList of cards
	public Card drawCard() {
		
		int i = (int)(Math.random() * cards.size());
		Card c = cards.get(i);
		cards.remove(i);
		return c;
	}
	
}

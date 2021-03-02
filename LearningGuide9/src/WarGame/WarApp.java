package WarGame;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class WarApp {
	
	private static Hand p1;
	private static Hand p2;
	private static Deck deck;
	private static int round;
	private static ArrayList<Card> roundCards; // Holds the cards that are currently 'fighting'
	private static boolean gameOver;
	
	
	public static void main(String[] args) {
		deck = new Deck();
		p1 = new Hand();
		p2 = new Hand();
		gameOver = false;
		round = 1;
		roundCards = new ArrayList<Card>();
		
		//create a hand
		for(int i = 0; i<26; i++) {
			p1.addCard(deck.drawCard());
		}
		//create the other hand
		for(int i = 0; i<26; i++) {
			p2.addCard(deck.drawCard());
		}
		//p1.printHand();
		//p2.printHand();
		
		//Play the game, waiting 1/4 seconds between each round
		while(!gameOver) {
			playRound();
			round++;
			try {
			TimeUnit.MILLISECONDS.sleep(250);
			}
			catch (Exception e){
				System.out.println("Sleep exception!");
			}
		}

	}
	
	//plays a round of the game
	public static void playRound() {
		Card c1 = p1.drawCard();
		Card c2 = p2.drawCard();
		System.out.println("Round: " + round);
		System.out.println("Player 1: " + c1.toString());
		System.out.println("Player 2: " + c2.toString());
		
		compareCards(c1,c2);
		
		//Check to see if any win conditions have been met
		if(p1.getHand().size() < 1) {
			gameOver = true;
			System.out.println("Player 2 has won!");
		}
		else if(p2.getHand().size() < 1) {
			gameOver = true;
			System.out.println("Player 1 has won!");
		}
		
		System.out.println("P1 Hand Size: " + p1.getHand().size() +
				" P2 Hand Size: " + p2.getHand().size());
	}
	
	//Compares the two cards passed in and determines what to do with them
	public static void compareCards(Card c1, Card c2) {
		roundCards.add(c1);
		roundCards.add(c2);

		//Player 1's card is greater
		if(c1.getValue() > c2.getValue()) {
			addCardsToHand(p1,roundCards);
		}
		//Player 2's card is greater
		else if(c2.getValue() > c1.getValue()) {
			addCardsToHand(p2,roundCards);
		}
		//Player 1 and 2 tied, creating a war
		else {
			if(war()) {
				Card c1w = p1.drawCard();
				Card c2w = p2.drawCard();
				compareCards(c1w,c2w);	
			}
		}
		
		//Remove all cards from roundCards ArrayList
		roundCards.clear();
	}
	
	//Adds cards for a war to the roundCards arrayList, returns true if a war can happen
	public static boolean war() {
		System.out.println("War!");
		
		//Makes sure none of the hands are too low to have a war
		if(p1.getHand().size() <= 2) {
			gameOver = true;
			System.out.println("Player 2 has won!");
			return false;
		}
		else if(p2.getHand().size() <= 2) {
			gameOver = true;
			System.out.println("Player 1 has won!");
			return false;
		}
		else {
			roundCards.add(p1.drawCard());
			roundCards.add(p1.drawCard());
			roundCards.add(p2.drawCard());
			roundCards.add(p2.drawCard());
			return true;
		}

	}
	
	//Adds cards to the hand of a player
	public static void addCardsToHand(Hand p, ArrayList<Card> cards) {
		for(Card c : cards) {
			p.addCard(c);
		}
	}
	
}

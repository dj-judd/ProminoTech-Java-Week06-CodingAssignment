package week6_Coding_Assignment;

import java.util.Random;

/*
        b. Deck
            i. Fields
                1. cards (List of Card)
            ii. Methods
                1. shuffle (randomizes the order of the cards)
                2. draw (removes and returns the top card of the Cards field)
                3. In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
*/

public class Deck {
	
	public Card cards[]; //array of Card objects
	private int currentCard; // index of the next Card to be dealt
	private final int sizeOfDeck = 52; //number of cards in the deck
	private Random randomNumbers; //random number generator
	
	//constructor that fills the deck when instantiated
	public Deck() {
		String[] cardFace = {"Two","Three","Four"," Five","Six","Seven","Eight",
							 "Nine","Ten","Jack","Queen","King","Ace"};
		String[] cardSuit = {"Clubs","Diamonds","Hearts","Spades"};
		int[] cardValue = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		cards = new Card[sizeOfDeck]; // creating an array of Card objects
		currentCard = 0; // sets the current card so 1st card dealt is deck[0]
		randomNumbers = new Random();
		// populate the deck with card objects
		for (int count = 0; count < cards.length; count++) {
			cards[count] = new Card(cardFace[count % 13], cardSuit[count/13],cardValue[count % 13]);		
		} // end of populator for-loop
	} // end of Deck constructor
	
	public void shuffle() {
		// after shuffling, deal should start at cards[0] again
		currentCard = 0; // re-initializing currentCard	
		// for each card, pick another random card and swap them
		for (int first = 0; first < cards.length; first++) {
			// select a random number between 0 and 51
			int second = randomNumbers.nextInt(sizeOfDeck);
			
			// swap the current Card with the randomly selected Card
			Card temp = cards[first];
			cards[first] = cards[second];
			cards[second] = temp;
		} // end of shuffle for-loop
	} // end of shuffle
	
	public Card draw() {
		if (currentCard < cards.length) {
			return cards[currentCard++]; // returns the current Card in the array
		} else {
			return null; // returns null to indicate that all cards were dealt
		}
	} // end of draw method	
} // end of Deck
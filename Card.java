package week6_Coding_Assignment;

/*        a. Card
i. Fields
    1. value (contains a value from 2-14 representing cards 2-Ace)
    2. name (e.g. Ace of Diamonds, or Two of Hearts)
ii. Methods
    1. Getters and Setters
    2. describe (prints out information about a card)
*/

public class Card {
	
	private String cardFace; // ex: Two, Three...King, Ace
	private String cardSuit; // ex: Clubs, Diamonds...
	private int cardValue; //numeric value of card from 2-14
	
	// 3 argument constructor that initializes the card's face, suit, & numeric value
	public Card(String face, String suit, int value) {
		setCardFace(face); //initialize face of the card
		setCardSuit(suit); //initialize suit of the card
		setCardValue(value); //initialize value of the card
	} //end of constructor
	
	//Getters & Setters
	
	public String getCardFace() {
		return this.cardFace;	
	} //end of Face setter
	
	public void setCardFace(String newName) {
		this.cardFace = newName;
	} //end of Face setter
	
	public String getCardSuit() {
		return cardSuit;
	} //end of Suit getter

	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	} //end of Suit setter
	
	public int getCardValue(){
		return this.cardValue;
	} //end of Value getter
	
	public void setCardValue(int newValue) {
		this.cardValue = newValue;
	} //end of Value setter
	
	public String describe() {
		return cardValue + " " + cardFace + " of " + cardSuit;
	} //end of Describe method
} //end of Class
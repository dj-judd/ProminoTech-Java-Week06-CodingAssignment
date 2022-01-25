package week6_Coding_Assignment;


/*
        c. Player
            i. Fields
                1. hand (List of Card)
                2. score (set to 0 in the constructor)
                3. name
            ii. Methods
                1. describe (prints out information about the player and calls the describe method for each card in the Hand List)
                2. flip (removes and returns the top card of the Hand)
                3. draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
                4. incrementScore (adds 1 to the Player’s score field)
*/

public class Player{
	
	public Card playerHand[]; //array of Card objects
	private int currentCardIndex; // index of the next Card to be flipped
	private final int sizeOfHand = 26; // number of cards in the deck
	private int score; // score of player
	private String name; // name of player

	
	//constructor that initializes the score
	public Player(String name){
		score = 0; // sets initial score to 0
		setPlayerName(name); //initialize name of the player
		
		playerHand = new Card[sizeOfHand];
		currentCardIndex = 0; // initialize this variable for flipping cards
		
	} // end of Player constructor
	
	public String getPlayerName(){
		return this.name;
	} //end of name getter
	
	public void setPlayerName(String newName) {
		this.name = newName;
	} //end of name setter
	
	
	public void describe() {
		System.out.println("Name: " + this.name + " Score: " + this.score);
		for(int i = 0; i < 26; i++) {
			System.out.println(playerHand[i]);
		}
	} // end of describe method
	
	public Card flip() {
		if (currentCardIndex < playerHand.length) {
			return playerHand[currentCardIndex++]; // returns the current Card in the array
		} else {
			return null; // returns null to indicate that all cards were dealt
		} // end of if-else loop
	} // end of flip method
	
	public Card draw(Deck inputDeck) {
		return inputDeck.draw();
	} // end of draw method
	
	public void incrementScore() {
		score++;
	} // end of incrementScore method
	
	public int getPlayerScore(){
		return this.score;
	} //end of PlayerScore getter
	

} // end of Player class


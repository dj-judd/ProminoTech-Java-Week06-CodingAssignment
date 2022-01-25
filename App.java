package week6_Coding_Assignment;

/*
2. Create a class called App with a main method.
3. Instantiate a Deck and two Players, call the shuffle method on the deck.
4. Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
5. Using a traditional for loop, iterate 26 times and call the flip method for each player.
    a. Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
6. After the loop, compare the final score from each player. 
7. Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
*/

public class App {

	public static void main(String[] args) {
		Deck playingDeck = new Deck(); // instantiating the main deck
		Player p1 = new Player("Player 1"); // instantiating Player 1
		Player p2 = new Player("Player 2"); // instantiating Player 2

		playingDeck.shuffle(); // shuffle the main deck of cards
		
		// Dealing the Deck between the 2 Players
		for(int i = 0; i < 26; i++) {
			p1.playerHand[i] = p1.draw(playingDeck);
			p2.playerHand[i] = p2.draw(playingDeck);
				// end of if-else
		} // end of for loop
	
		// Flipping and comparing Card values to see who won
		for(int i = 0; i < 26; i++) {
			int player1Flip = p1.flip().getCardValue();
			int player2Flip = p2.flip().getCardValue();
			
			if (player1Flip > player2Flip) {
				p1.incrementScore();
			} else {
				p2.incrementScore();
			} // end if-else loop
		} // end of for loop
					
		// Comparing Scores to see who won
		if (p1.getPlayerScore() == p2.getPlayerScore()) {
			System.out.println(p1.getPlayerName() + "'s score is: " + p1.getPlayerScore());
			System.out.println(p2.getPlayerName() + "'s score is: " + p2.getPlayerScore());
			System.out.println("Game is a Draw");
		} else if (p1.getPlayerScore() > p2.getPlayerScore()) {
			System.out.println(p1.getPlayerName() + "'s score is: " + p1.getPlayerScore());
			System.out.println(p2.getPlayerName() + "'s score is: " + p2.getPlayerScore());
			System.out.println(p1.getPlayerName() + " wins!");
		} else {
			System.out.println(p1.getPlayerName() + "'s score is: " + p1.getPlayerScore());
			System.out.println(p2.getPlayerName() + "'s score is: " + p2.getPlayerScore());
			System.out.println(p2.getPlayerName() + " wins!");
		} // End Score Comparison
		
	} // end of main method
} // end of App class
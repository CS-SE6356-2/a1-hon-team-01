package model;

/**
 * Represents a player in a card game, can be extended for additional functionality.
 */
public class Player {
	private Deck[] decks;
	
	public Player(final int deckCount) {
		decks = new Deck[deckCount];
	}
	
	public Deck getDeck(final int index) {
		return decks[index];
	}
}
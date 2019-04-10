package model;

import java.util.ArrayList;

/**
 * Represents a player in a card game, can be extended for additional functionality.
 */
public class Player {
	private ArrayList[] decks;
	
	public Player(final int deckCount) {
		decks = new ArrayList[deckCount];
	}
	
	public ArrayList getDeck(final int index) {
		return decks[index];
	}
}
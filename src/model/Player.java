package model;

import java.util.ArrayList;

/**
 * Represents a player in a card game, can be extended for additional functionality.
 */
class Player {
	private ArrayList[] decks;
	
	Player(final int deckCount) {
		decks = new ArrayList[deckCount];
		for(int i = 0; i < deckCount; i++){
			decks[i] = new ArrayList<Card>();
		}
	}
	
	ArrayList getDeck(final int index) {
		return decks[index];
	}
	
	int getDeckAmount(){
		return decks.length;
	}
}
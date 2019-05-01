package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a player in a card game, can be extended for additional functionality.
 */
public class Player {
	private List<Card>[] decks;
	
	public Player(final int deckCount) {
		decks = new List[deckCount];
		for(int i = 0; i < deckCount; i++){
			decks[i] = new ArrayList<>();
		}
	}
	
	public List<Card> getDeck(final int index) {
		return decks[index];
	}
	
	public int getDeckCount() {
		return decks.length;
	}
}

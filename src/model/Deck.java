package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an arbitrary collection of cards
 */
public class Deck extends ArrayList<Card> {
	private int openCount;
	private int hiddenCount;
	
	/**
	 * Sets the visibility of cards in this Deck.
	 * @param nVisibleToAll these many cards at the top of the Deck can be seen by all players
	 * @param nVisibleToNone these many cards at the bottom of the Deck cannot be seen by any players, even the one who owns this Deck
	 */
	public void setCardVisibility(final int nVisibleToAll, final int nVisibleToNone) {
		openCount = nVisibleToAll;
		hiddenCount = nVisibleToNone;
	}
	
	public List<Card> getVisibleToAllSubist() {
		return subList(0, Math.min(openCount, size() - hiddenCount));
	}
	
	public List<Card> getVisibleToSelfSubist() {
		return subList(Math.min(openCount, size() - hiddenCount), Math.max(size() - hiddenCount, 0));
	}
	
	public List<Card> getVisibleToNoneSubist() {
		return subList(Math.max(size() - hiddenCount, 0), size());
	}
}
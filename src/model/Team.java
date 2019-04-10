package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Represents a team in a card game, can be extended for additional functionality.
 */
class Team {
	private Player[] players;
	
	Team(Player... players) {
		this.players = players.clone();
	}
	
	public List<Player> getPlayers() {
		return Collections.unmodifiableList(Arrays.asList(players));
	}
}
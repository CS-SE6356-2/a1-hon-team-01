package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeamTest {
	
	private Team team;
	private Player player1;
	private Player player2;
	
    @BeforeEach
    void setUp() {
    	player1 = new Player(5);
    	player2 = new Player(3);
    	
    	Player[] players = new Player[2];
    	
    	players[0]=player1;
    	players[1]=player2;
    	
    	team = new Team(players);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPlayers() {
    	assertEquals(player1,team.getPlayers().get(0));
    	assertEquals(player2,team.getPlayers().get(1));
    }
}
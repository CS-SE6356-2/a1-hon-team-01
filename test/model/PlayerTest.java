package model;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
	
	private Player player;
	private Player player2;
	
    @BeforeEach
    void setUp() {
    	player = new Player(3);
    	player2 = new Player(3);
    }

    @AfterEach
    void tearDown() {
    }

    /* Tests if the decks were constructed properly and that no two players have received
     * the same deck. Also tests if getDeck returns a Player's deck.
     */
    @Test
    void getDeck() {
    	for(int i=0;i<player.getDeckAmount();i++){
            assertNotNull(player.getDeck(i));
    		for(int j=0;j<player2.getDeckAmount();j++){
                assertNotSame(player.getDeck(i), player2.getDeck(j));
    		}
    	}
    }
}
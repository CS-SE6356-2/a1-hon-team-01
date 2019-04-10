package model;


import java.util.List;

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

    /* Tests if the decks were constructed properly:
     * - every deck should be non-null
     * - every deck should be empty
     * - no two players should have the same deck
     */
    @Test
    void getDeckTest() {
    	for (int i = 0; i < player.getDeckCount(); ++i) {
    		final List<Card> deck = player.getDeck(i);
            assertNotNull(deck);
            assertTrue(deck.isEmpty());
    		for (int j = 0; j < player2.getDeckCount(); ++j) {
        		final List<Card> deck2 = player2.getDeck(j);
                assertNotSame(deck, deck2);
    		}
    	}
    }
}
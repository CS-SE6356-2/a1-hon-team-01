package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.StandardCard.Suit;
import model.StandardCard.Value;

import static org.junit.jupiter.api.Assertions.*;

class StandardCardTest {
	private StandardCard card;
	
    @BeforeEach
    void setUp() {
    	card = new StandardCard(Suit.CLUBS, Value.ACE);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSuitTest() {
    	assertEquals(Suit.CLUBS, card.getSuit());
    }

    @Test
    void getValueTest() {
    	assertEquals(Value.ACE, card.getValue());
    }

    @Test
    void equalsTest() {
    	StandardCard card2 = new StandardCard(Suit.CLUBS, Value.ACE);
    	assertTrue(card.equals(card));
    	assertFalse(card.equals(null));
    	assertTrue(card.equals(card2));
    }

    // every card in ALL_CARDS should return a different value for toString()
    @Test
    void toStringTest() {
    	assertEquals(card.toString(), "A"+"C"/*'\u2663'*/);
    }
}
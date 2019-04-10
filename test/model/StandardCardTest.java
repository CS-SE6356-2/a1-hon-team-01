package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.StandardCard.Suit;
import model.StandardCard.Value;

import static org.junit.jupiter.api.Assertions.*;

class StandardCardTest {
	
	StandardCard card;
	
    @BeforeEach
    void setUp() {
    	card = new StandardCard(Suit.CLUBS,Value.ACE);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSuit() {
    	assertEquals(Suit.CLUBS,card.getSuit());
    }

    @Test
    void getValue() {
    	assertEquals(Value.ACE,card.getValue());
    }

    @Test
    void equals() {
    	StandardCard card2 = new StandardCard(Suit.CLUBS,Value.ACE);
    	assertTrue(card.equals(card));
    	assertFalse(card.equals(null));
    	assertTrue(card.equals(card2));
    }

    @Test
    void toStringTest() {
    	assertEquals(card.toString(), "A"+"C"/*'\u2663'*/);
    }
}
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.StandardCard.Suit;
import model.StandardCard.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static model.StandardCard.ALL_CARDS;

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
    
    /* properties of StandardCard.ALL_CARDS:
     * - contains a card for every possible suit-value combination
     * - contains no duplicate cards
     * - contains no null cards
     * - the cards are in sorted order
     */
    @Test
    void allCardsTest() {
    	// contains a card for every possible suit-value combination?
    	for (final Suit suit: Suit.values()) {
    		for (final Value value: Value.values()) {
    			final StandardCard card = new StandardCard(suit, value);
    			assertTrue(StandardCard.ALL_CARDS.contains(card));
    		}
    	}
    	
    	// contains no duplicate cards?
    	final Set<StandardCard> set = new HashSet<>(ALL_CARDS);
    	assertTrue(set.size() == ALL_CARDS.size());
    	
    	// contains no null cards?
    	assertFalse(set.contains(null));
    	
    	// the cards are in sorted order?
    	final List<StandardCard> list = new ArrayList<>(ALL_CARDS);
    	Collections.sort(list);
    	assertEquals(list, ALL_CARDS);
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
    	for (final StandardCard card: ALL_CARDS) {
    		for (final StandardCard card2: ALL_CARDS) {
        		if (card.equals(card2)) {
        			assertTrue(card.toString().equals(card2.toString()));
        		} else {
        			assertFalse(card.toString().equals(card2.toString()));
        		}
        	}
    	}
    }
}
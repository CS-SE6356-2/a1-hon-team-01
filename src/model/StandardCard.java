package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * A card from the standard 52-card playing deck, with a suit and value.
 */
public final class StandardCard implements Card {
	public static final List<StandardCard> ALL_CARDS = makeCards();
	
	private static final List<StandardCard> makeCards() {
		List<StandardCard> cards = new ArrayList<>(Suit.values().length * Value.values().length);
		for (final Suit suit: Suit.values()) {
			for (final Value value: Value.values()) {
				cards.add(new StandardCard(suit, value));
			}
		}
		return Collections.unmodifiableList(cards);
	}
	
	public static enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES;
		
		public char toCharacter() {
			switch (this) {
			case CLUBS:
				return '\u2663';
			case DIAMONDS:
				return '\u2666';
			case HEARTS:
				return '\u2665';
			case SPADES:
				return '\u2660';
			default:
				throw new IllegalStateException();
			}
		}
	}
	public static enum Value {
		ACE, NUM2, NUM3, NUM4, NUM5, NUM6, NUM7, NUM8, NUM9, NUM10, JACK, QUEEN, KING;
		
		public String toShortString() {
			switch (this) {
			case ACE:
				return "A";
			case JACK:
				return "J";
			case QUEEN:
				return "Q";
			case KING:
				return "K";
			default:
				return toString().substring(3);
			}
		}
	}
	
	private final Suit suit;
	private final Value value;
	
	public StandardCard(final Suit suit, final Value value) {
		this.suit = suit;
		this.value = value;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public Value getValue() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof StandardCard))
			return false;
		StandardCard other = (StandardCard) obj;
		return suit == other.suit && value == other.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(suit, value);
	}

	@Override
	public String toString() {
		return value.toShortString() + suit.toCharacter();
	}
}
package com.cognixia.jump.collectionsgenerics;

public class Card {
	public enum Value {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACJ, QUEEN, KING;
		
		public static Value getValues(int index) {
			Value[] values = Value.values();
			return values[index];
		}
		public static int getValueLength() {
			return Value.values().length;
		}
	}
	
	public enum Suit {
		HEART, DIAMOND, CLUB, SPADE;
		
		public static Suit getValues(int index) {
			Suit[] suits = Suit.values();
			return suits[index];
		}
		public static int getValueLength() {
			return Suit.values().length;
		}
	}
	
	private Suit suit;
	private Value value;
	
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}
	public Suit getSuit() {
		return this.suit;
	}
	public Value getValue() {
		return this.value;
	}
	public String toStrintg() {
		return this.suit + "_" + this.value;
	}
}

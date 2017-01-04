package com.effectivejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class IterarorHasNext {
	enum Suit {
		CLUB, DIAMOND, HEART, SPADE
	}

	enum Rank {
		ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}

	@Test
	public void test() {

		Collection<Suit> suits = Arrays.asList(Suit.values());
		Collection<Rank> ranks = Arrays.asList(Rank.values());
		List<Card> deck = new ArrayList<Card>();
		for (Iterator<Suit> i = suits.iterator(); i.hasNext();) {
			Suit nextSuit = i.next();
			for (Iterator<Rank> j = ranks.iterator(); j.hasNext();)
				deck.add(new Card(nextSuit, j.next()));
		}
	}
	
	@Test
	public void using_for_each() {
		List<Card> deck = new ArrayList<Card>();
		for(Suit suit : Arrays.asList(Suit.values())) {
			for(Rank rank : Arrays.asList(Rank.values())) {
				deck.add(new Card(suit, rank));
			}
		}
	}

	class Card {
		private Suit suit;
		private Rank rank;

		public Card(Suit suit, Rank rank) {
			this.suit = suit;
			this.rank = rank;
		}

		public Suit getSuit() {
			return suit;
		}

		public void setSuit(Suit suit) {
			this.suit = suit;
		}

		public Rank getRank() {
			return rank;
		}

		public void setRank(Rank rank) {
			this.rank = rank;
		}

	}
}

package com.skilldistillery.blackjack;

import java.util.*;

/*
Create a class Deck. It will hold a List of Cards.
In the constructor, initialize the List with all 52 cards.
Add a method checkDeckSize which returns the number of cards still in the deck.
Add a method dealCard that removes a Card from the deck.
Add a method shuffle to shuffle the deck.
(Solution: Deck.java)
*/

public class Deck {
	
	private List<Card> deck = new ArrayList<>();

	public Deck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				Card card = new Card(suit, rank);
				deck.add(card);
			}
		}
	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	
	public void remainingCardsInDeck() {
		System.out.println(deck.size());
	}
	
	public Card dealCard() {
		Card card = deck.get(0);
		deck.remove(0);
		return card;
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public void showDeck() {
		System.out.println();
		for (int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i));
		}
	}

	
	
	
	
}
	
//Add a method checkDeckSize which returns the number of cards still in the deck.
//Add a method dealCard that removes a Card from the deck.
//Add a method shuffle to shuffle the deck.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


//
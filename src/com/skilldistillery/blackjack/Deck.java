package com.skilldistillery.blackjack;

import java.util.*;

/*
Labs

Create a class called Card.

A card has a Suit and Rank. Set these in the constructor.
Generate the methods hashCode and equals
Add a toString which says rank + " of " + suit.
Add a method getValue to return the card's numeric value.
(Solution: Card.java)

We will be simulating a deck of cards.

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
	
	public void removeCard(Card card) {
		deck.remove(card);
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}

	
	
	
	
}
	
//Add a method checkDeckSize which returns the number of cards still in the deck.
//Add a method dealCard that removes a Card from the deck.
//Add a method shuffle to shuffle the deck.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


//
package com.skilldistillery.blackjack;

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

Write a program to ask a user how many cards they want.

Handle the case where users enter a non-integer or a number greater than 52: 
print an error message.
Deal the cards and display them on the screen. Also display the total value 
of all cards.

(Solution: Dealing.java)
*/

public class Card {
	
	private Suit suit;
	
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
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

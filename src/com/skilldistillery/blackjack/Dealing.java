package com.skilldistillery.blackjack;

import java.util.*;

/*
Write a program to ask a user how many cards they want.

Handle the case where users enter a non-integer or a number greater than 52: print an error message.
Deal the cards and display them on the screen. Also display the total value of all cards.

(Solution: Dealing.java)
*/

public class Dealing {
	
	private Deck deck = new Deck();
	

	public static void main(String[] args) {
		Dealing deal = new Dealing();
		deal.deal();
	}
		
	public void deal() {
		
//		cards please
//		
//		error message
		
		int input = 10;
		
		
		
		

	
		
		for (int i = 0; i < 52; i++) {
			
			System.out.println();
			System.out.println(deck.getDeck().get(i));
			
		}
	}

}


//public void remainingCardsInDeck() {
//	System.out.println(deck.size());
//}
//
//public void removeCard(Card card) {
//	deck.removeCard(card);
//}
//
//public void shuffle() {
//	Collections.shuffle(deck);
//}

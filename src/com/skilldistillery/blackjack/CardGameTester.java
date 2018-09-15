package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardGameTester {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		for (int i = 0; i < 52; i++) {
			
			System.out.println();
			System.out.println(deck.getDeck().get(i));
			
		}

	}

}

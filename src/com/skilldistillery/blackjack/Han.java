/*package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Han extends Hand {
	
	private List<Card> hand = new ArrayList<>();
	
	private Deck myDeck = new Deck();
	
	public int getHanValue(String c) {
		int value = 0;
		for (Card card : hand) {
			value = value + card.getRank().getValue();
			
			if (value > 21 && card.getRank().getValue() == 11) {
				value = value - 10;
			}
		}
		
		return value;
	}
	
	public Han(String name, String c) {
		super(name);
		myDeck.shuffle();
		int tempValue = 0;
		int tempDeckSize = myDeck.getDeck().size();
		int numberOfAces = 0;
		while (tempValue < 21 && tempDeckSize > 0) {
			tempDeckSize = myDeck.getDeck().size();
			Card cardTemp = myDeck.dealCard();
			if (cardTemp.getRank().getValue() == 11) {
				numberOfAces++;
			}
			tempValue = getHanValue("c");
			int tempValueTwo = cardTemp.getRank().getValue() + getHanValue("c");
			if (tempValueTwo <= 21) {
				hand.add(cardTemp);
			}
			numberOfAces = 0;
			for (Card card : hand) {
				if (card.getRank().getValue() == 11) {
					numberOfAces++;
				}
			}
			
		}
	}
	

	


}
*/
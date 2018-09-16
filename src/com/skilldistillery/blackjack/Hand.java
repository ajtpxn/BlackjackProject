package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	
	private String name = null;
	
	private List<Card> hand = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	
	public Hand(String name, List<Card> hand) {
		super();
		this.name = name;
		this.hand = hand;
	}
	
	public Hand(String name) {
		super();
		this.name = name;
	}
	
	
	public int getHandValue() {
		int value = 0;
		for (Card card : hand) {
			int cardValue = card.getRank().getValue();
			
			value = value + cardValue;
			
			if (value > 21 && card.getRank().ordinal() == 12) {
				value = value - 10;
			}
		}
		
		return value;
	}
	private Deck myDeck = new Deck();
	
	public Hand(String name, String c) {
		super();
		this.name = name;
		int tempDeckSize = myDeck.getDeck().size();
		int tempValue = 0;
		int numberOfAces = 0;
		while (getHandValue() != 21) {

			while (tempValue < 21 && tempDeckSize > 10) {
				if (tempDeckSize < 20) {
					myDeck = new Deck();
				}
				myDeck.shuffle();
				tempDeckSize = myDeck.getDeck().size();
				Card cardTemp = myDeck.dealCard();
				if (cardTemp.getRank().ordinal() == 12) {
					numberOfAces++;
				}
				tempValue = getHandValue();
				int tempValueTwo = cardTemp.getRank().getValue() + tempValue;
				if (tempValueTwo < 21 || cardTemp.getRank().ordinal() == 12) {
					hand.add(cardTemp);
				}
				numberOfAces = 0;
				for (Card card : hand) {
					if (card.getRank().ordinal() == 12) {
						numberOfAces++;
					}
				}
			}
			
		}
	}

}

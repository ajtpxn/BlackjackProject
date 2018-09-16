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

	public int getHandValue() {
		int value = 0;
		for (Card card : hand) {
			value = value + card.getRank().getValue();
		}
		return value;
	}
	
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	
	public Hand(String name, String c) {
		super();
		this.name = name;
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

}

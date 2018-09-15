package com.skilldistillery.blackjack;

import java.util.*;
import java.util.regex.*;

/*
Write a program to ask a user how many cards they want.

Handle the case where users enter a non-integer or a number greater than 52: print an error message.
Deal the cards and display them on the screen. Also display the total value of all cards.

(Solution: Dealing.java)
*/

public class Dealing {
	
	private Deck deck = new Deck();
	
	private List<Card> myCards = new ArrayList<>();
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Dealing dealMain = new Dealing();
		dealMain.deal();
		dealMain = null;
		scanner.close();
	}
	
	public void deal() {
		boolean stay = true;
		while (stay) {
			String input = null;
			System.out.println("Please input the number of cards you want, \"s\" for shuffle or \"q\" for quit: ");
			input = scanner.nextLine();

			if (!input.isEmpty()) {
				if (input.equals("q")) {
					System.out.println("quitting");
					stay = false;
				} 
				else if (input.equals("s")) {
					shuffle();
				}
				else if (input.equals("r")) {
					remainingCardsInDeck();
				}
				else if (input.equals("d")) {
					showDeck();
				}
				else if (input.equals("m")) {
					showMyCards();
				}
				else {
					Pattern pattern = Pattern.compile("[1*2*3*4*5*6*7*8*9*0*]*");
					Matcher patternMatch = pattern.matcher(input);
					boolean inputMatchesPattern = patternMatch.matches();
					if (inputMatchesPattern) {
						int inputParsedToInteger = Integer.parseInt(input);
						if (inputParsedToInteger <= 52 && inputParsedToInteger >= 1) {
							System.out.println(inputParsedToInteger + " card(s) delt.");
							dealCard(inputParsedToInteger);
						} 
						else {
							System.out.println("Invalid input."); 
						}
					} 
					else {
						System.out.println("Invalid input."); 
					}
				}
			}
			else {
				System.out.println("Invalid input."); 
			}
		}
	}
	
	public void dealCard(int numberOfCardsToDeal) { //d
		for (int i = 0; i < numberOfCardsToDeal; i++) {
			Card cardBeingDelt = deck.dealCard();
			myCards.add(cardBeingDelt);
		}
	}
	
	public void showMyCards() { //m
		System.out.println();
		for (int i = 0; i < myCards.size(); i++) {
			System.out.println(myCards.get(i));
		}
	}
	
	
	public void showDeck() {  //d
		deck.showDeck();
	}
	
	public void remainingCardsInDeck() { //r
		deck.remainingCardsInDeck();
	}
	
	public void shuffle() { //s
		deck.shuffle();
	}
	
	
	
}


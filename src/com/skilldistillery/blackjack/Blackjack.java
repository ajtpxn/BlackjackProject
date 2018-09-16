package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Blackjack {
	
private Deck deck = new Deck();

private int c = 0;
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Blackjack game = new Blackjack();
		game.play();
		game = null;
		scanner.close();
	}

	private void play() {
		System.out.println("Welcome to Blackjack! Are you ready? (P)lay or (Q)uit: ");
		boolean stayPlay = true;
		while (stayPlay) {
			String input = null;
			input = scanner.nextLine();
			switch (input) {
			case "q":
				stayPlay = false;
				break;
			case "Q":
				stayPlay = false;
				break;
			case "n":
				stayPlay = false;
				break;
			case "N":
				stayPlay = false;
				break;
			case "c":
				c = 1;
				deal();
				break;
			case "p":
				deal();
				break;
			case "P":
				deal();
				break;
			case "y":
				deal();
				break;
			case "Y":
				deal();
				break;
			case "h":
				deal();
				break;
			case "s":
				deal();
				break;

			default:
				System.out.println("Invalid input.");
				break;
			}
		}
	}
	
	
	public void deal() {
		
		if (deck.getDeck().size() < 27) {
			deck = new Deck();
		}
		shuffle();
		Hand player = new Hand("Player");
		Hand dealer = new Hand("Dealer");
		dealCard(player);
		dealCard(dealer);
		showCards(dealer);
		showHandValue(dealer);
		dealCard(player);
		dealCard(dealer);
		if (c == 1) {
			player = null;
			player = new Hand("Player", "c");
		}
		showCards(player);
		showHandValue(player);
		boolean stayDealPlayer = true;
		while (stayDealPlayer) {
			System.out.println("Would you like to (h)it or (s)tay?: ");
			String input = null;
			input = scanner.nextLine();

			switch (input) {
			case "q":
				stayDealPlayer = false;
				break;
			case "h":
				playerPlays(player);
				break;
			case "s":
				stayDealPlayer = false;
				break;
			case "r":
				remainingCardsInDeck();
				break;
			case "m":
				showCards(player);
				break;
			case "v":
				showHandValue(player);
				break;
			case "d":
				showDeck();
				break;

			default:
				System.out.println("Invalid input.");
				break;
			}
			
			if (player.getHandValue() > 21) {
				System.out.println();
				System.out.println("You busted. Sorry!");
				stayDealPlayer = false;
				input = "q";
			}
			else if (c == 1) {
				stayDealPlayer = false;
				input = "q";
			}

		}
		
		dealerFinishes(dealer); // dealer finishes playing

		System.out.println();
		showHandValue(player); //player value
		showHandValue(dealer); //dealer value
		System.out.println();
		
		
		if (player.getHandValue() > 21) {
			System.out.println("You busted!");
			System.out.println("Dealer wins.");
		}
		else if (dealer.getHandValue() > 21) {
			System.out.println("Dealer busted.");
			System.out.println("You win!");
		}
		else {
			System.out.println("Nobody busted.");
			if (player.getHandValue() < dealer.getHandValue()) {
				System.out.println();
				System.out.println("Dealer wins.");
				System.out.println();
			}
			else if (player.getHandValue() > dealer.getHandValue()) {
				System.out.println();
				System.out.println("You win!");
				System.out.println();
			}
			else {
				System.out.println();
				System.out.println("Push.");
				System.out.println();
			}
			
		}
		c = 0;	

		System.out.println();
		System.out.println("*********************************************************************************");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Would you like to play again? (Y)es or (N)o: ");
	}
	
	private void playerPlays(Hand hand) { //s
		dealCard(hand);
		showCards(hand);
		showHandValue(hand);
	}
	
	private void dealerFinishes(Hand hand) { //s
		System.out.println("Dealer playing.");
		showCards(hand);
		showHandValue(hand);
		while (hand.getHandValue() < 17) {
			System.out.println("Dealer hits.");
			dealCard(hand);
			showCards(hand);
			showHandValue(hand);
		}
	}

	public void dealCard(Hand hand) { //deal
		Card cardBeingDelt = deck.dealCard();
		hand.addCard(cardBeingDelt);
	}
	
	public void showCards(Hand hand) { //m
		System.out.println(hand.getName() +   hand.getHand());
	}
	
	public void showHandValue(Hand hand) { //v
		System.out.println(hand.getName() + " hand value " +   hand.getHandValue());
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

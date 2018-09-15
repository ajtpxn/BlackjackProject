package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Blackjack {
	
private Deck deck = new Deck();
	
	
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

			default:
				System.out.println("Invalid input.");
				break;
			}
		}
	}
	
	
	public void deal() {



		shuffle();
		Hand player = new Hand("Player");
		Hand dealer = new Hand("Dealer");
		dealCard(player);
		dealCard(dealer);
		showCards(dealer);
		showHandValue(dealer);
		dealCard(player);
		dealCard(dealer);
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
				break;
			}
			
			if (player.getHandValue() > 21) {
				System.out.println();
				System.out.println("You busted. Sorry!");
				stayDealPlayer = false;
				input = "q";
			}

		}
		
		System.out.println("Dealer finishing.");
		dealerFinishes(dealer);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		if (dealer.getHandValue() <= 21) {
			System.out.println("dealer.getHandValue() <= 21");
			if (player.getHandValue() < dealer.getHandValue()) {
				System.out.println("player.getHandValue() < dealer.getHandValue()");
				System.out.println("Dealer wins.");
				System.out.println();
			}
			
			else {
				System.out.println("dealer.getHandValue() <= 21 ----- else ");
				if (player.getHandValue() <= 21) {
					System.out.println("player.getHandValue() <= 21  "+player.getHandValue());
					if (player.getHandValue() > dealer.getHandValue()) {
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
			}
		}


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
		System.out.println("Dealer finishing.");
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

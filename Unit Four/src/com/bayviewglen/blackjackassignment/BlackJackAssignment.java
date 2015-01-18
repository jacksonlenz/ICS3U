package com.bayviewglen.blackjackassignment;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class BlackJackAssignment {
	static int KING = 10;
	static int QUEEN = 10;
	static int JACK = 10;
	static int ACE = 11;
	static String[] suits = { "H", "S", "C", "D" };
	static int[] values = { 2, 3, 4, 5, 6, 7, 8, 9, JACK, KING, QUEEN, ACE };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double wallet = 500.00;
		int bet = 0;
		int playerScore = 0;
		int dealerScore = 0;
		boolean quit = false;

		introduction();

		NameGet(scanner);

		GetLocale(scanner, wallet);

		while (!quit) {

			getBet(scanner, wallet, bet);

			dealCard(suits, values, playerScore);

			dealCard(suits, values, playerScore);

			dealDealerCard(suits, values, dealerScore);
			
			dealHiddenDealerCard(suits, values, dealerScore);

			getHit(scanner, wallet, bet, playerScore, dealerScore);

			finalRequest();

		}

	}

	private static void dealHiddenDealerCard(String[] cards, int[] values,
			int dealerScore) {
		int cardSuitInt = (int) (Math.random() * 4);
		String cardSuit = cards[cardSuitInt];

		int cardValueInt = (int) (Math.random() * 12);
		String faceValue = getSuit(values[cardValueInt]);
		System.out.println("_______________________________");
		System.out.println("");
		System.out.println("xx");
		System.out.println("");
		System.out.println("_______________________________");
		dealerScore += values[cardValueInt];
		
		return;
		
	}

	private static void dealDealerCard(String[] cards, int[] values,
			int dealerScore) {

		int cardSuitInt = (int) (Math.random() * 4);
		String cardSuit = cards[cardSuitInt];

		int cardValueInt = (int) (Math.random() * 12);
		String faceValue = getSuit(values[cardValueInt]);
		System.out.println("_______________________________");
		System.out.println("");
		System.out.println(faceValue + cardSuit);
		System.out.println("");
		System.out.println("_______________________________");
		dealerScore += values[cardValueInt];
		
		return;
	}

	private static void finalRequest() {

	}

	public static String getSuit(int index) {
		index = index + 2;

		if (index > 9) {
			if (index == 10)
				return "J";
			else if (index == 11)
				return "Q";
			else if (index == 12)
				return "K";
			else if (index == 13)
				return "A";

		}

		return "" + index;
	}

	private static void doubleDown(double wallet, int bet) {
		if (wallet >= bet * 2) {
			bet = bet * 2;

			System.out.println("You have " + wallet + " and your bet is now "
					+ bet + ".");
		}
		return;
	}

	private static void youFold(int playerScore, int dealerScore) {
		if (playerScore > dealerScore) {
			System.out.println("YOU ARE THE WINNER! CONGRATULATIONS!");
		} else if (playerScore <= dealerScore) {

			System.out.println("You have lost, loser!");

		}
		return;
	}

	private static void getHit(Scanner scanner, double wallet, int bet,
			int playerScore, int dealerScore) {
		boolean decisionMade = false;
		while (!decisionMade) {

			int playerDecision = 0;
			System.out.println("The first pair of cards is yours and the second pair is the dealer's.");
			System.out.println("Would you like to: ");
			System.out.println("");
			System.out.println("1. Hit?");
			System.out.println("");
			System.out.println("2. Fold?");
			System.out.println("");
			System.out.println("3. Double down? ");
			System.out
					.println("(Please input the number beside the desired option)");

			String playerDecisionString = scanner.nextLine();

			try {
				playerDecision = Integer.parseInt(playerDecisionString);
			} catch (NumberFormatException ex) {
				System.out.println("Please input a number. Basic stuff: ");
			}
			if (playerDecision < 1) {
				System.out.println("Please input a CORRECT number: ");
			} else if (playerDecision == 1) {

				decisionMade = true;
			} else if (playerDecision == 2) {
				youFold(playerScore, dealerScore);
				decisionMade = true;
			} else if (playerDecision == 3) {
				doubleDown(wallet, bet);
				decisionMade = true;
			} else {
				System.out.println("Please input a CORRECT number: ");
			}
		}
		return;
	}

	private static void dealCard(String[] cards, int[] values, int playerScore) {
		int cardSuitInt = (int) (Math.random() * 4);
		String cardSuit = cards[cardSuitInt];

		int cardValueInt = (int) (Math.random() * 12);
		String faceValue = getSuit(values[cardValueInt]);
		System.out.println("_______________________________");
		System.out.println("");
		System.out.println(faceValue + cardSuit);
		System.out.println("");
		System.out.println("_______________________________");
		playerScore += values[cardValueInt];
		
		return;
	}

	private static void getBet(Scanner scanner, double wallet, int bet) {

		System.out.println("How much would you like to bet?: ");

		boolean betDone = false;
		while (!betDone) {
			String playerBet = scanner.nextLine();

			try {
				bet = Integer.parseInt(playerBet);
			} catch (NumberFormatException ex) {
				System.out.println("Please input a NUMBER.: ");
			}
			if (bet > wallet) {
				System.out
						.println("You do not have enough money to make that bet! Please try another number.");
			} else if (bet <= 0) {
				System.out
						.println("You cannot bet a negative number! Please try another number.");
			} else {
				wallet -= bet;
				System.out.println("You now have " + wallet
						+ " in your wallet.");

				betDone = true;
			}
		}
		return;
	}

	private static Locale GetLocale(Scanner scanner, double wallet) {

		boolean doneLocale = false;
		while (!doneLocale) {

			System.out
					.println("Please input the number beside the locale you wish to use: ");
			System.out.println("1. Canada");
			System.out.println("2. United States");
			System.out.println("3. United Kingdom");
			System.out.println("4. Germany");

			String PlayerLocale = scanner.nextLine();

			int nationality = 0;
			try {
				nationality = Integer.parseInt(PlayerLocale);
			} catch (NumberFormatException ex) {

			}
			if (nationality == 1) {
				NumberFormat moneyFormatter = NumberFormat
						.getCurrencyInstance(Locale.CANADA);
				System.out.println("You have " + moneyFormatter.format(wallet)
						+ " in your wallet.");
				return Locale.CANADA;

			} else if (nationality == 2) {
				NumberFormat moneyFormatter = NumberFormat
						.getCurrencyInstance(Locale.US);
				System.out.println("You have " + moneyFormatter.format(wallet)
						+ " in your wallet.");
				return Locale.US;

			} else if (nationality == 3) {
				NumberFormat moneyFormatter = NumberFormat
						.getCurrencyInstance(Locale.UK);
				System.out.println("You have " + moneyFormatter.format(wallet)
						+ " in your wallet.");
				return Locale.UK;

			} else if (nationality == 4) {
				NumberFormat moneyFormatter = NumberFormat
						.getCurrencyInstance(Locale.GERMANY);
				System.out.println("You have " + moneyFormatter.format(wallet)
						+ " in your wallet.");
				return Locale.GERMANY;

			} else {

				System.out.println("Nice try. Please input an ACTUAL NUMBER.");

			}
		}
		return null;

	}

	private static void NameGet(Scanner scanner) {
		System.out.println("But first, would you please tell me your name?: ");
		String PlayerName = scanner.nextLine();
	}

	private static void introduction() {
		System.out
				.println("Hello player! Welcome to Blackjack! If you don't know how to play blackjack, you probably should look that up first.");

	}

}

package com.bayviewglen.blackjackassignment;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class BlackJackAssignment2 {
	static final int KING = 10;
	static final int QUEEN = 10;
	static final int JACK = 10;
	static final int ACE = 11;
	static final String[] suits = { "H", "S", "C", "D" };
	static final int[] values = { 2, 3, 4, 5, 6, 7, 8, 9, JACK, KING, QUEEN,
			ACE };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double[] wallet = { 500.00 };
		int[] bet = { 0 };
		int[] playerScore = { 0 };
		int[] dealerScore = { 0 };
		boolean quit = false;

		roduction();

		NameGet(scanner);

		GetLocale(scanner, wallet);
		while (!quit) {
			getBet(scanner, wallet, bet);

			dealCard(suits, values, playerScore);

			dealCard(suits, values, playerScore);

			dealDealerCard(suits, values, dealerScore);

			dealHiddenDealerCard(suits, values, dealerScore);

			dealerAi(dealerScore, suits, values);

			getHit(scanner, wallet, bet, playerScore, dealerScore);

			System.out.println("Would you like to play again?");
			System.out.println("1. Yes 2. No");
			boolean decision = false;
			String yesOrNo = scanner.nextLine();
			int[] finalQuit = { 0 };
			while (!decision) {
				try {
					finalQuit[0] = Integer.parseInt(yesOrNo);
				} catch (NumberFormatException ex) {

				}
				if (finalQuit[0] == 2) {
					decision = true;
					quit = true;
				} else if (finalQuit[0] == 1) {
					System.out.println("Next round!");
					decision = true;
				} else {
					System.out.println("Please input 1 or 2.");
				}
			}
		}
	}

	private static void dealerAi(int[] dealerScore, String[] suits2, int[] suits) {
		while (dealerScore[0] < 17) {
			getDealerCard(suits2, dealerScore, suits);
		}
		if (dealerScore[0] > 21) {
			System.out.println("The dealer has busted! You win!");
		}

	}

	private static void getDealerCard(String[] cards, int[] values,
			int[] dealerScore) {
		int[] cardSuitint = { (int) (Math.random() * 4) };
		String cardSuit = cards[cardSuitint[0]];

		int[] cardValueint = { (int) (Math.random() * 12) };
		String faceValue = getSuit(values[cardValueint[0]]);
		dealerScore[0] += values[cardValueint[0]];

		return;

	}

	private static void dealHiddenDealerCard(String[] cards, int[] values,
			int[] dealerScore) {
		int[] cardSuitint = { (int) (Math.random() * 4) };
		String cardSuit = cards[cardSuitint[0]];

		int[] cardValueint = { (int) (Math.random() * 12) };
		String faceValue = getSuit(values[cardValueint[0]]);
		System.out.println("_______________________________");
		System.out.println("");
		System.out.println("xx");
		System.out.println("");
		System.out.println("_______________________________");
		dealerScore[0] += values[cardValueint[0]];

		return;

	}

	private static void dealDealerCard(String[] cards, int[] values2,
			int[] dealerScore) {

		int[] cardSuitint = { (int) (Math.random() * 4) };
		String cardSuit = cards[cardSuitint[0]];

		int[] cardValueint = { (int) (Math.random() * 12) };
		String faceValue = getSuit(values2[cardValueint[0]]);
		System.out.println("_______________________________");
		System.out.println("");
		System.out.println(faceValue + cardSuit);
		System.out.println("");
		System.out.println("_______________________________");
		dealerScore[0] += values2[cardValueint[0]];

		return;
	}

	private static void finalRequest(Scanner scanner, boolean quit) {
		System.out.println("Would you like to play again?");
		System.out.println("1. Yes 2. No");
		boolean decision = false;
		String yesOrNo = scanner.nextLine();
		int[] finalQuit = { 0 };
		while (!decision) {
			try {
				finalQuit[0] = Integer.parseInt(yesOrNo);
			} catch (NumberFormatException ex) {

			}
			if (finalQuit[0] == 2) {
				decision = true;
				quit = true;
			} else if (finalQuit[0] == 1) {
				System.out.println("Next round!");
				decision = true;
			} else {
				System.out.println("Please input 1 or 2.");
			}
		}
		return;
	}

	public static String getSuit(int values2) {
		values2 = values2 + 2;

		if (values2 > 9) {
			if (values2 == 10)
				return "J";
			else if (values2 == 11)
				return "Q";
			else if (values2 == 12)
				return "K";
			else if (values2 == 13)
				return "A";

		}

		return "" + values2;
	}

	private static void doubleDown(double[] wallet, int[] bet,
			int[] playerScore, int[] dealerScore) {
		if (wallet[0] >= bet[0]) {
			bet[0] = bet[0] * 2;
			wallet[0] -= bet[0];
			System.out.println("You have " + wallet[0]
					+ " and your bet is now " + bet[0] + ".");
			dealCard(suits, values, playerScore);
			if (playerScore[0] <= dealerScore[0]) {
				System.out.println("You have lost, loser!");
			} else if (playerScore[0] > dealerScore[0])
				;
			System.out.println("YOU WIN! CONGRATULATIONS!");

		}

		return;
	}

	private static void youFold(int[] playerScore, int[] dealerScore) {
		if (playerScore[0] >= dealerScore[0]) {
			System.out.println("YOU ARE THE WINNER! CONGRATULATIONS!");
		} else if (playerScore[0] <= dealerScore[0]) {

			System.out.println("You have lost, loser!");

		}
		return;
	}

	private static void getHit(Scanner scanner, double[] wallet, int[] bet,
			int[] playerScore, int[] dealerScore) {
		boolean decisionMade = false;
		while (!decisionMade) {

			int[] playerDecision = { 0 };
			System.out
					.println("The first pair of cards is yours and the second pair is the dealer's.");
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
				playerDecision[0] = Integer.parseInt(playerDecisionString);
			} catch (NumberFormatException ex) {
				System.out.println("Please input a number. Basic stuff: ");
			}
			if (playerDecision[0] < 1) {
				System.out.println("Please input a CORRECT number: ");
			} else if (playerDecision[0] == 1) {
				dealCard(suits, values, playerScore);
				if (playerScore[0] < 21 && playerScore[0] > dealerScore[0]) {
					System.out.println("YOU WIN! CONGRATULATIONS");

				} else if (playerScore[0] > 21) {
					System.out.println("You busted! Better luck next time!");

				} else if (playerScore[0] <= dealerScore[0]) {
					System.out.println("You've been bested by the dealer!");

				}

				decisionMade = true;
			} else if (playerDecision[0] == 2) {
				youFold(playerScore, dealerScore);
				decisionMade = true;
			} else if (playerDecision[0] == 3) {
				doubleDown(wallet, bet, playerScore, dealerScore);
				decisionMade = true;
			} else {
				System.out.println("Please input a CORRECT number: ");
			}
		}
		return;
	}

	private static void dealCard(String[] cards, int[] values2,
			int[] playerScore) {
		int[] cardSuitint = { (int) (Math.random() * 4) };
		String cardSuit = cards[cardSuitint[0]];

		int[] cardValueint = { (int) (Math.random() * 12) };
		String faceValue = getSuit(values2[cardValueint[0]]);
		System.out.println("_______________________________");
		System.out.println("");
		System.out.println(faceValue + cardSuit);
		System.out.println("");
		System.out.println("_______________________________");
		playerScore[0] += values2[cardValueint[0]];
		if (playerScore[0] > 21) {
			System.out.println("You have busted, buster!");

		}
		return;
	}

	private static void getBet(Scanner scanner, double[] wallet, int[] bet) {

		System.out.println("How much would you like to bet?: ");

		boolean betDone = false;
		while (!betDone) {
			String playerBet = scanner.nextLine();

			try {
				bet[0] = Integer.parseInt(playerBet);
			} catch (NumberFormatException ex) {
				System.out.println("Please input a NUMBER.: ");
			}
			if (bet[0] > wallet[0]) {
				System.out
						.println("You do not have enough money to make that bet! Please try another number.");
			} else if (bet[0] <= 0) {
				System.out
						.println("You cannot bet a negative number! Please try another number.");
			} else {
				wallet[0] -= bet[0];
				System.out.println("You now have " + wallet[0]
						+ " in your wallet.");

				betDone = true;
			}
		}
		return;
	}

	private static Locale GetLocale(Scanner scanner, double[] wallet) {

		boolean doneLocale = false;
		while (!doneLocale) {

			System.out
					.println("Please input the number beside the locale you wish to use: ");
			System.out.println("1. Canada");
			System.out.println("2. United States");
			System.out.println("3. United Kingdom");
			System.out.println("4. Germany");

			String PlayerLocale = scanner.nextLine();

			int[] nationality = { 0 };
			try {
				nationality[0] = Integer.parseInt(PlayerLocale);
			} catch (NumberFormatException ex) {

			}
			if (nationality[0] == 1) {
				NumberFormat moneyFormatter = NumberFormat
						.getCurrencyInstance(Locale.CANADA);
				System.out
						.println("You have " + moneyFormatter.format(wallet[0])
								+ " in your wallet.");
				return Locale.CANADA;

			} else if (nationality[0] == 2) {
				NumberFormat moneyFormatter = NumberFormat
						.getCurrencyInstance(Locale.US);
				System.out
						.println("You have " + moneyFormatter.format(wallet[0])
								+ " in your wallet.");
				return Locale.US;

			} else if (nationality[0] == 3) {
				NumberFormat moneyFormatter = NumberFormat
						.getCurrencyInstance(Locale.UK);
				System.out
						.println("You have " + moneyFormatter.format(wallet[0])
								+ " in your wallet.");
				return Locale.UK;

			} else if (nationality[0] == 4) {
				NumberFormat moneyFormatter = NumberFormat
						.getCurrencyInstance(Locale.GERMANY);
				System.out
						.println("You have " + moneyFormatter.format(wallet[0])
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

	private static void roduction() {
		System.out
				.println("Hello player! Welcome to Blackjack! If you don't know how to play blackjack, you probably should look that up first.");

	}

}

package com.bayviewglen.horseracing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HorseRacing {

	public static void main(String[] args) throws InterruptedException {
		boolean game = false;
		while (!game) {
			int numHorsesInRace = 8; // This number is the constant # of horses
										// that will be in the race
			Scanner keyboard = new Scanner(System.in);
			String[] horseNames = null; // This array will contain the names of
										// the horses
			String[] playerNames = null; // This array will contain the amount
											// of players that are playing in
											// the current round
			int numPlayers = 0;
			String[][] masterArray = null; // This array is what my code is
											// built around. It is a 2d array
											// that contains everything about
											// the game, the amount of players,
											// the names of the players, the
											// amount of money in each player's
											// wallet, each player's bet, and
											// the horse each player bets on.
			String[] horsesInRace = new String[numHorsesInRace]; // This array
																	// contains
																	// the names
																	// of the
																	// horses
																	// that will
																	// be in the
																	// race
			try {
				Scanner playerScanner = new Scanner(new File(
						"Horse Racing Input/playerData.dat")); // This method is
																// the one that
																// reads the
																// data of the
																// players
				int playersInGame = Integer.parseInt(playerScanner.nextLine());

				playerNames = new String[playersInGame];

				for (int i = 0; i < playersInGame; i++) {

					playerNames[i] = playerScanner.nextLine();

				}
				numPlayers = playersInGame;
				masterArray = new String[numPlayers][4];
				for (int i = 0; i < masterArray.length; i++) {
					masterArray[i][0] = playerNames[i].split(" ")[0];
					masterArray[i][1] = playerNames[i].split(" ")[1];

				}

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}

			try {
				Scanner horseScanner = new Scanner(new File( // Conversely, this
																// section of
																// code takes
																// the data of
																// the horses
						"Horse Racing Input/horseData.dat"));
				int numHorses = Integer.parseInt(horseScanner.nextLine());

				horseNames = new String[numHorses];

				for (int i = 0; i < numHorses; i++) {
					horseNames[i] = horseScanner.nextLine();
				}

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}

			boolean horse = false;
			while (!horse) {
				introduction();

				getBet(masterArray, keyboard, numPlayers, horseNames,
						numHorsesInRace, horsesInRace);

				runRace(numHorsesInRace, masterArray, horsesInRace, playerNames);

				playAgain(keyboard, game, masterArray, horse, playerNames);
			}
		}
	}

	private static void playAgain(Scanner keyboard, boolean game,
			String[][] masterArray, boolean horse, String[] playerNames) {
		System.out
				.println("Would you like to play again? All player data will be saved to the playerData.dat file. (please type yes or no):");
		String finalRequest = keyboard.nextLine();
		if (finalRequest.equalsIgnoreCase("yes")) {
			System.out.println("Get ready for the next round!");
			horse = false;

		} else if (finalRequest.equalsIgnoreCase("no")) {
			System.out
					.println("All player data has been saved. Thanks for playing! :)");
			try {
				PrintWriter writer = new PrintWriter(
						"Horse Racing Input/playerData.dat");
				writer.println(playerNames.length);

				for (int i = 0; i < masterArray.length; i++) {
					writer.println(masterArray[i][0] + " " + masterArray[i][1]);
				}
				writer.close();
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		}

		horse = true;
		game = true;
		System.exit(0);

	}

	private static void runRace(int numHorsesInRace, String[][] masterArray,

	String[] horsesInRace, String[] playerNames) throws InterruptedException {
		// The race was arguably the most difficult part of the project to do.
		// This is because it used a lot of nested loops, making fixing infinite
		// loops something I had to to do a lot.
		String[] movement = new String[numHorsesInRace];
		for (int i = 0; i < movement.length; i++) {
			movement[i] = "0";
		}
		int horseDistanceRan = 0;
		int trackLength = 100;
		System.out.println("The race will start in 3...");
		Thread.sleep(1000);
		System.out.println("2...");
		Thread.sleep(1000);
		System.out.println("1...");
		Thread.sleep(1000); // Thread.sleep is pretty awesome.
		System.out.println("GO!");
		while (horseDistanceRan < 100) {
			for (int i = 0; i < horsesInRace.length; i++) {
				int horseMoverRandomComponent = ((int) (Math.random() * 5) + 1);
				int addMovement = Integer.parseInt(movement[i]);
				int horseMover = horseMoverRandomComponent + addMovement;
				System.out
						.println("----------------------------------------------------------------------------------------------------");
				for (int j = 0; j < horseMover; j++) {
					System.out.print(" ");
				}
				System.out.println(i);
				System.out
						.println("----------------------------------------------------------------------------------------------------");
				int horseDistanceAdjuster = Integer.parseInt(movement[i]);
				horseDistanceAdjuster += horseMover;
				horseMover = horseDistanceAdjuster;
				movement[i] = Integer.toString(horseDistanceAdjuster);
				if (horseMover >= trackLength) {
					System.out.println(horsesInRace[i] + " has won!");
					String winningHorse = horsesInRace[i];
					i = horsesInRace.length;
					horseDistanceRan = 100;
					for (int k = 0; k < playerNames.length; k++) {
						int addedBets = 0;
						if (winningHorse.equalsIgnoreCase(masterArray[k][3])) {
							for (int l = 0; l < playerNames.length; l++) {
								int lostBet = Integer
										.parseInt(masterArray[k][2]);
								addedBets += lostBet;
							}
							int wallet = Integer.parseInt(masterArray[k][1]);
							int newWallet = wallet + addedBets;
							masterArray[k][1] = Integer.toString(newWallet);
							System.out
									.println(masterArray[k][0]
											+ " has won! Wallets have been adjusted according to bets.");
						}

					}
				}

			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			Thread.sleep(400);
		}
	}

	private static void getBet(
			String[][] masterArray,
			Scanner keyboard, // The method getBet is we obtain all of the
								// player-inputed data, specifically their horse
								// and their bet. This is done by asking the
								// player for a bet input, and then saving the
								// input in the master array.

			// Getting the players choice of horse was a slight trickier, so I
			// decided to make it so that the player input was an integer, and
			// simply have if statements determining which horse they chose.
			// This was then also saved to the array as a String, in order so I
			// could determine the winner and give him/her their deserved
			// winnings.
			int numPlayers, String[] horseNames, int numHorsesInRace,
			String[] horsesInRace) {
		for (int i = 0; i <= masterArray.length - 1; i++) {
			System.out.println(masterArray[i][0]
					+ ", please enter the amount you'd like to bet: ");
			String playerBet = keyboard.nextLine();
			masterArray[i][2] = playerBet;
			int walletAdjuster = Integer.parseInt(masterArray[i][1]);
			int playerBetInt = 0;

			try {
				playerBetInt = Integer.parseInt(playerBet);

			} catch (NumberFormatException ex) {

			}

			int adjustedWallet = walletAdjuster - playerBetInt;
			masterArray[i][1] = Integer.toString(adjustedWallet);
		}
		for (int i = 0; i <= numHorsesInRace - 1; i++) {
			int randomHorsePicker = (int) (Math.random() * 86);
			String randomHorse = horseNames[randomHorsePicker];
			horsesInRace[i] = randomHorse;
			System.out.println(i + ". " + horsesInRace[i]);
		}
		for (int i = 0; i <= numPlayers - 1; i++) {
			System.out
					.println(masterArray[i][0]
							+ ", which horse would you like to bet on? (please input the number beside the horse you wish to be on): ");
			String horseChoice = keyboard.nextLine();
			int horseChoiceInt = 0;
			try {
				horseChoiceInt = Integer.parseInt(horseChoice);
			} catch (NumberFormatException ex) {

			}
			if (horseChoiceInt == 0) {
				masterArray[i][3] = horsesInRace[0];
				System.out.println(masterArray[i][0] + " you have bet "
						+ masterArray[i][2] + " on " + masterArray[i][3]
						+ ". You now have " + masterArray[i][1]
						+ " in your wallet.");
			} else if (horseChoiceInt == 1) {
				masterArray[i][3] = horsesInRace[1];
				System.out.println(masterArray[i][0] + " you have bet "
						+ masterArray[i][2] + " on " + masterArray[i][3]
						+ ". You now have " + masterArray[i][1]
						+ " in your wallet.");
			} else if (horseChoiceInt == 2) {
				masterArray[i][3] = horsesInRace[2];
				System.out.println(masterArray[i][0] + ", you have bet "
						+ masterArray[i][2] + " on " + masterArray[i][3]
						+ ". You now have " + masterArray[i][1]
						+ " in your wallet.");
			} else if (horseChoiceInt == 3) {
				masterArray[i][3] = horsesInRace[3];
				System.out.println(masterArray[i][0] + ", you have bet "
						+ masterArray[i][2] + " on " + masterArray[i][3]
						+ ". You now have " + masterArray[i][1]
						+ " in your wallet.");
			} else if (horseChoiceInt == 4) {
				masterArray[i][3] = horsesInRace[4];
				System.out.println(masterArray[i][0] + ", you have bet "
						+ masterArray[i][2] + " on " + masterArray[i][3]
						+ ". You now have " + masterArray[i][1]
						+ " in your wallet.");
			} else if (horseChoiceInt == 5) {
				masterArray[i][3] = horsesInRace[5];
				System.out.println(masterArray[i][0] + ", you have bet "
						+ masterArray[i][2] + " on " + masterArray[i][3]
						+ ". You now have " + masterArray[i][1]
						+ " in your wallet.");
			} else if (horseChoiceInt == 6) {
				masterArray[i][3] = horsesInRace[6];
				System.out.println(masterArray[i][0] + ", you have bet "
						+ masterArray[i][2] + " on " + masterArray[i][3]
						+ ". You now have " + masterArray[i][1]
						+ " in your wallet.");
			} else if (horseChoiceInt == 7) {
				masterArray[i][3] = horsesInRace[7];
				System.out.println(masterArray[i][0] + ", you have bet "
						+ masterArray[i][2] + " on " + masterArray[i][3]
						+ ". You now have " + masterArray[i][1]
						+ " in your wallet.");
			} else if (horseChoiceInt > numHorsesInRace) {
				System.out.println("Please input a different number: ");
			}

		}
		return;
	}

	private static void introduction() {
		System.out
				.println("Welcome to Horse Racing! This gambling extravaganza is yours to play!");

	}

}

package com.bayviewglen.xcountryassignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryAssignment {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("00.000");
		// This section assigns the keyboard as the new scanner and assigns DecimalFormad as a new formatter.
		int SECONDS_PER_MINUTE = 60;
		// This is setting the number of seconds in a minute, as to avoid magic numbers.
		System.out.println("Please enter your first and last name: ");
		String Runner1 = keyboard.nextLine();
		// This section prompts the user for the name of the runner.
		System.out.println(Runner1
				+ ", Please enter the time for your first mile (mm:ss.sss): ");
		String Mile1Runner1 = keyboard.nextLine();
		int MinutesForRunner1Mile1 = Integer.parseInt(Mile1Runner1.substring(0,
				Mile1Runner1.indexOf(':')));
		int MinutesToSecondsRunner1Mile1 = MinutesForRunner1Mile1
				* SECONDS_PER_MINUTE;
		double SecondsForRunner1Mile1 = Double.parseDouble(Mile1Runner1
				.substring(Mile1Runner1.indexOf(':') + 1));
		double TotalSecondsRunner1Mile1 = SecondsForRunner1Mile1
				+ MinutesToSecondsRunner1Mile1;
		// This section prompts the user for their mile 1 time, and then converts it from a string into to a double that can be used in equations.
		System.out.println(Runner1 + ", Please enter the time for your second mile (mm:ss.sss): ");
		String Mile2Runner1 = keyboard.nextLine();
		int MinutesForRunner1Mile2 = Integer.parseInt(Mile2Runner1.substring(0,
				Mile2Runner1.indexOf(':')));
		int MinutesToSecondsRunner1Mile2 = MinutesForRunner1Mile2
				* SECONDS_PER_MINUTE;
		double SecondsForRunner1Mile2 = Double.parseDouble(Mile2Runner1
				.substring(Mile2Runner1.indexOf(':') + 1));
		double TotalSecondsRunner1Mile2 = SecondsForRunner1Mile2
				+ MinutesToSecondsRunner1Mile2;
		// This section prompts the user for their mile 2 time, and then converts it from a string into to a double that can be used in equations.
		System.out.println(Runner1
				+ ", Please enter your total time: (mm:ss.sss): ");
		String Mile3Runner1 = keyboard.nextLine();
		int MinutesForRunner1Mile3 = Integer.parseInt(Mile3Runner1.substring(0,
				Mile3Runner1.indexOf(':')));
		int MinutesToSecondsRunner1Mile3 = MinutesForRunner1Mile3
				* SECONDS_PER_MINUTE;
		double SecondsForRunner1Mile3 = Double.parseDouble(Mile3Runner1
				.substring(Mile3Runner1.indexOf(':') + 1));
		double TotalSecondsRunner1Mile3 = SecondsForRunner1Mile3
				+ MinutesToSecondsRunner1Mile3;
		// This section prompts the user for their mile 3 time, and then converts it from a string into to a double that can be used in equations.
		double Split1Runner1 = TotalSecondsRunner1Mile1;
		int FinalMinutesRunner1Mile1 = (int) Split1Runner1 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner1Mile1 = Split1Runner1 % SECONDS_PER_MINUTE;
		String FinalSplit1Runner1 = FinalMinutesRunner1Mile1 + ":"
				+ formatter.format(FinalSecondsRunner1Mile1);
		// This section formats the first mile into a string displayable in a chart
 		double Split2Runner1 = TotalSecondsRunner1Mile2
				- TotalSecondsRunner1Mile1;
		int FinalMinutesRunner1Mile2 = (int) Split2Runner1 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner1Mile2 = Split1Runner1 % SECONDS_PER_MINUTE;
		String FinalSplit2Runner1 = FinalMinutesRunner1Mile2 + ":"
				+ formatter.format(FinalSecondsRunner1Mile2);
		// This section formats the second mile into a string displayable in a chart
		double Split3Runner1 = TotalSecondsRunner1Mile3;
		int FinalMinutesRunner1Mile3 = (int) Split3Runner1 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner1Mile3 = Split3Runner1 % SECONDS_PER_MINUTE;
		String FinalSplit3Runner1 = FinalMinutesRunner1Mile3 + ":"
				+ formatter.format(FinalSecondsRunner1Mile3);
		// This section formats the third mile into a string displayable in a chart
		System.out.println("Runner Summary:");
		System.out.println("---------------");
		System.out.println(Runner1);
		System.out.printf("%-10s-%15s\n", "Split One", FinalSplit1Runner1);
		System.out.printf("%-10s-%15s\n", "Split Two", FinalSplit2Runner1);
		System.out.printf("%-10s-%15s\n", "Split Three", FinalSplit3Runner1);
		System.out.printf("%-10s-%15s\n", "Final Time", Mile3Runner1);
		// This displays all of the splits and the name of the runner
		System.out.println("------------------------------");

		System.out.println("Please enter your first and last name: ");
		String Runner2 = keyboard.nextLine();
		// This section prompts the user for the name of the runner.
		System.out.println(Runner2
				+ ", Please enter the time for your first mile (mm:ss.sss): ");
		String Mile1Runner2 = keyboard.nextLine();
		int MinutesForRunner2Mile1 = Integer.parseInt(Mile1Runner2.substring(0,
				Mile1Runner2.indexOf(':')));
		int MinutesToSecondsRunner2Mile1 = MinutesForRunner2Mile1
				* SECONDS_PER_MINUTE;
		double SecondsForRunner2Mile1 = Double.parseDouble(Mile1Runner2
				.substring(Mile1Runner2.indexOf(':') + 1));
		double TotalSecondsRunner2Mile1 = SecondsForRunner2Mile1
				+ MinutesToSecondsRunner2Mile1;
		// This section prompts the user for their mile 1 time, and then converts it from a string into to a double that can be used in equations.
		System.out.println(Runner2
				+ ", Please enter the time for your second mile (mm:ss.sss): ");
		String Mile2Runner2 = keyboard.nextLine();
		int MinutesForRunner2Mile2 = Integer.parseInt(Mile2Runner2.substring(0,
				Mile2Runner2.indexOf(':')));
		int MinutesToSecondsRunner2Mile2 = MinutesForRunner2Mile2
				* SECONDS_PER_MINUTE;
		double SecondsForRunner2Mile2 = Double.parseDouble(Mile2Runner2
				.substring(Mile2Runner2.indexOf(':') + 1));
		double TotalSecondsRunner2Mile2 = SecondsForRunner2Mile2
				+ MinutesToSecondsRunner2Mile2;
		// This section prompts the user for their mile 2 time, and then converts it from a string into to a double that can be used in equations.
		System.out.println(Runner2
				+ ", Please enter your total time: (mm:ss.sss): ");
		String Mile3Runner2 = keyboard.nextLine();
		int MinutesForRunner2Mile3 = Integer.parseInt(Mile3Runner2.substring(0,
				Mile3Runner2.indexOf(':')));
		int MinutesToSecondsRunner2Mile3 = MinutesForRunner2Mile3
				* SECONDS_PER_MINUTE;
		double SecondsForRunner2Mile3 = Double.parseDouble(Mile3Runner2
				.substring(Mile3Runner2.indexOf(':') + 1));
		double TotalSecondsRunner2Mile3 = SecondsForRunner2Mile3
				+ MinutesToSecondsRunner2Mile3;
		// This section prompts the user for their mile 3 time, and then converts it from a string into to a double that can be used in equations.
		double Split1Runner2 = TotalSecondsRunner2Mile1;
		int FinalMinutesRunner2Mile1 = (int) Split1Runner2 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner2Mile1 = Split1Runner2 % SECONDS_PER_MINUTE;
		String FinalSplit1Runner2 = FinalMinutesRunner2Mile1 + ":"
				+ formatter.format(FinalSecondsRunner2Mile1);
		// This section formats the first mile into a string displayable in a chart
		double Split2Runner2 = TotalSecondsRunner2Mile2
				- TotalSecondsRunner2Mile1;
		int FinalMinutesRunner2Mile2 = (int) Split2Runner2 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner2Mile2 = Split1Runner2 % SECONDS_PER_MINUTE;
		String FinalSplit2Runner2 = FinalMinutesRunner2Mile2 + ":"
				+ formatter.format(FinalSecondsRunner2Mile2);
		// This section formats the second mile into a string displayable in the chart
		double Split3Runner2 = TotalSecondsRunner2Mile3;
		int FinalMinutesRunner2Mile3 = (int) Split3Runner2 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner2Mile3 = Split3Runner2 % SECONDS_PER_MINUTE;
		String FinalSplit3Runner2 = FinalMinutesRunner2Mile3 + ":"
				+ formatter.format(FinalSecondsRunner2Mile3);
		// This section formats the third mile into a string displayable in a chart
		System.out.println("Runner Summary:");
		System.out.println("---------------");
		System.out.println(Runner2);
		System.out.printf("%-10s-%15s\n", "Split One", FinalSplit1Runner2);
		System.out.printf("%-10s-%15s\n", "Split Two", FinalSplit2Runner2);
		System.out.printf("%-10s-%15s\n", "Split Three", FinalSplit3Runner2);
		System.out.printf("%-10s-%15s\n", "Final Time", Mile3Runner2);
		// This displays all of the splits and the name of the runner
		System.out.print("------------------------------");

		System.out.println("Please enter your first and last name: ");
		String Runner3 = keyboard.nextLine();
		// This section prompts the user for the name of the runner.
		System.out.println(Runner3
				+ ", Please enter the time for your first mile (mm:ss.sss): ");
		String Mile1Runner3 = keyboard.nextLine();
		int MinutesForRunner3Mile1 = Integer.parseInt(Mile1Runner3.substring(0,
				Mile1Runner3.indexOf(':')));
		int MinutesToSecondsRunner3Mile1 = MinutesForRunner3Mile1
				* SECONDS_PER_MINUTE;
		double SecondsForRunner3Mile1 = Double.parseDouble(Mile1Runner3
				.substring(Mile1Runner3.indexOf(':') + 1));
		double TotalSecondsRunner3Mile1 = SecondsForRunner3Mile1
				+ MinutesToSecondsRunner3Mile1;
		// This section prompts the user for their mile 1 time, and then converts it from a string into to a double that can be used in equations.
		System.out.println(Runner3
				+ ", Please enter the time for your second mile (mm:ss.sss): ");
		String Mile2Runner3 = keyboard.nextLine();
		int MinutesForRunner3Mile2 = Integer.parseInt(Mile2Runner3.substring(0,
				Mile2Runner3.indexOf(':')));
		int MinutesToSecondsRunner3Mile2 = MinutesForRunner3Mile2
				* SECONDS_PER_MINUTE;
		double SecondsForRunner3Mile2 = Double.parseDouble(Mile2Runner3
				.substring(Mile2Runner3.indexOf(':') + 1));
		double TotalSecondsRunner3Mile2 = SecondsForRunner3Mile2
				+ MinutesToSecondsRunner3Mile2;
		// This section prompts the user for their mile 2 time, and then converts it from a string into to a double that can be used in equations.
		System.out.println(Runner3
				+ ", Please enter your total time: (mm:ss.sss): ");
		String Mile3Runner3 = keyboard.nextLine();
		int MinutesForRunner3Mile3 = Integer.parseInt(Mile3Runner3.substring(0,
				Mile3Runner3.indexOf(':')));
		int MinutesToSecondsRunner3Mile3 = MinutesForRunner3Mile3
				* SECONDS_PER_MINUTE;
		double SecondsForRunner3Mile3 = Double.parseDouble(Mile3Runner3
				.substring(Mile3Runner3.indexOf(':') + 1));
		double TotalSecondsRunner3Mile3 = SecondsForRunner3Mile3
				+ MinutesToSecondsRunner3Mile3;
		// This section prompts the user for their mile 3 time, and then converts it from a string into to a double that can be used in equations.
		double Split1Runner3 = TotalSecondsRunner3Mile1;
		int FinalMinutesRunner3Mile1 = (int) Split1Runner3 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner3Mile1 = Split1Runner3 % SECONDS_PER_MINUTE;
		String FinalSplit1Runner3 = FinalMinutesRunner3Mile1 + ":"
				+ formatter.format(FinalSecondsRunner3Mile1);
		// This section formats the first mile into a string displayable in a chart
		double Split2Runner3 = TotalSecondsRunner3Mile2
				- TotalSecondsRunner3Mile1;
		int FinalMinutesRunner3Mile2 = (int) Split2Runner3 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner3Mile2 = Split1Runner3 % SECONDS_PER_MINUTE;
		String FinalSplit2Runner3 = FinalMinutesRunner3Mile2 + ":"
				+ formatter.format(FinalSecondsRunner3Mile2);
		// This section formats the second mile into a string displayable in a chart
		double Split3Runner3 = TotalSecondsRunner3Mile3;
		int FinalMinutesRunner3Mile3 = (int) Split3Runner3 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner3Mile3 = Split3Runner3 % SECONDS_PER_MINUTE;
		String FinalSplit3Runner3 = FinalMinutesRunner3Mile3 + ":"
				+ formatter.format(FinalSecondsRunner3Mile3);
		// This section formats the third mile into a string displayable in a chart
		System.out.println("Runner Summary:");
		System.out.println("---------------");
		System.out.println(Runner3);
		System.out.printf("%-10s-%15s\n", "Split One", FinalSplit1Runner3);
		System.out.printf("%-10s-%15s\n", "Split Two", FinalSplit2Runner3);
		System.out.printf("%-10s-%15s\n", "Split Three", FinalSplit3Runner3);
		System.out.printf("%-10s-%15s\n", "Final Time", Mile3Runner3);
		// This displays all of the splits and the name of the runner
		System.out.println("------------------------------");

		System.out.println("Please enter your first and last name: ");
		String Runner4 = keyboard.nextLine();
		// This section prompts the user for the name of the runner.
		System.out.println(Runner4
				+ ", Please enter the time for your first mile (mm:ss.sss): ");
		String Mile1Runner4 = keyboard.nextLine();
		int MinutesForRunner4Mile1 = Integer.parseInt(Mile1Runner4.substring(0,
				Mile1Runner4.indexOf(':')));
		int MinutesToSecondsRunner4Mile1 = MinutesForRunner4Mile1
				* SECONDS_PER_MINUTE;
		double SecondsForRunner4Mile1 = Double.parseDouble(Mile1Runner4
				.substring(Mile1Runner4.indexOf(':') + 1));
		double TotalSecondsRunner4Mile1 = SecondsForRunner4Mile1
				+ MinutesToSecondsRunner4Mile1;
		// This section prompts the user for their mile 1 time, and then converts it from a string into to a double that can be used in equations.
		System.out.println(Runner1
				+ ", Please enter the time for your second mile (mm:ss.sss): ");
		String Mile2Runner4 = keyboard.nextLine();
		int MinutesForRunner4Mile2 = Integer.parseInt(Mile2Runner4.substring(0,
				Mile2Runner4.indexOf(':')));
		int MinutesToSecondsRunner4Mile2 = MinutesForRunner4Mile2
				* SECONDS_PER_MINUTE;
		double SecondsForRunner4Mile2 = Double.parseDouble(Mile2Runner4
				.substring(Mile2Runner4.indexOf(':') + 1));
		double TotalSecondsRunner4Mile2 = SecondsForRunner4Mile2
				+ MinutesToSecondsRunner4Mile2;
		// This section prompts the user for their mile 2 time, and then converts it from a string into to a double that can be used in equations.
		System.out.println(Runner1
				+ ", Please enter your total time: (mm:ss.sss): ");
		String Mile3Runner4 = keyboard.nextLine();
		int MinutesForRunner4Mile3 = Integer.parseInt(Mile3Runner4.substring(0,
				Mile3Runner4.indexOf(':')));
		int MinutesToSecondsRunner4Mile3 = MinutesForRunner4Mile3
				* SECONDS_PER_MINUTE;
		double SecondsForRunner4Mile3 = Double.parseDouble(Mile3Runner4
				.substring(Mile3Runner4.indexOf(':') + 1));
		double TotalSecondsRunner4Mile3 = SecondsForRunner4Mile3
				+ MinutesToSecondsRunner4Mile3;
		// This section prompts the user for their mile 3 time, and then converts it from a string into to a double that can be used in equations.
		double Split1Runner4 = TotalSecondsRunner4Mile1;
		int FinalMinutesRunner4Mile1 = (int) Split1Runner4 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner4Mile1 = Split1Runner4 % SECONDS_PER_MINUTE;
		String FinalSplit1Runner4 = FinalMinutesRunner4Mile1 + ":"
				+ formatter.format(FinalSecondsRunner4Mile1);
		// This section formats the first mile into a string displayable in a chart
		double Split2Runner4 = TotalSecondsRunner4Mile2
				- TotalSecondsRunner4Mile1;
		int FinalMinutesRunner4Mile2 = (int) Split2Runner4 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner4Mile2 = Split1Runner4 % SECONDS_PER_MINUTE;
		String FinalSplit2Runner4 = FinalMinutesRunner4Mile2 + ":"
				+ formatter.format(FinalSecondsRunner4Mile2);
		// This section formats the second mile into a string displayable in a chart
		double Split3Runner4 = TotalSecondsRunner4Mile3;
		int FinalMinutesRunner4Mile3 = (int) Split3Runner4 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner4Mile3 = Split3Runner4 % SECONDS_PER_MINUTE;
		String FinalSplit3Runner4 = FinalMinutesRunner4Mile3 + ":"
				+ formatter.format(FinalSecondsRunner4Mile3);
		// This section formats the third mile into a string displayable in a chart
		System.out.println("Runner Summary:");
		System.out.println("---------------");
		System.out.println(Runner4);
		System.out.printf("%-10s-%15s\n", "Split One", FinalSplit1Runner4);
		System.out.printf("%-10s-%15s\n", "Split Two", FinalSplit2Runner4);
		System.out.printf("%-10s-%15s\n", "Split Three", FinalSplit3Runner4);
		System.out.printf("%-10s-%15s\n", "Final Time", Mile3Runner4);
		// This displays all of the splits and the name of the runner
		System.out.println("------------------------------");

		System.out.println("Please enter your first and last name: ");
		String Runner5 = keyboard.nextLine();
		// This section prompts the user for the name of the runner.
		System.out.println(Runner5
				+ ", Please enter the time for your first mile (mm:ss.sss): ");
		String Mile1Runner5 = keyboard.nextLine();
		int MinutesForRunner5Mile1 = Integer.parseInt(Mile1Runner5.substring(0,
				Mile1Runner5.indexOf(':')));
		int MinutesToSecondsRunner5Mile1 = MinutesForRunner5Mile1
				* SECONDS_PER_MINUTE;
		double SecondsForRunner5Mile1 = Double.parseDouble(Mile1Runner5
				.substring(Mile1Runner5.indexOf(':') + 1));
		double TotalSecondsRunner5Mile1 = SecondsForRunner5Mile1
				+ MinutesToSecondsRunner5Mile1;
		// This section prompts the user for their mile 1 time, and then converts it from a string into to a double that can be used in equations.
		System.out.println(Runner1
				+ ", Please enter the time for your second mile (mm:ss.sss): ");
		String Mile2Runner5 = keyboard.nextLine();
		int MinutesForRunner5Mile2 = Integer.parseInt(Mile2Runner5.substring(0,
				Mile2Runner5.indexOf(':')));
		int MinutesToSecondsRunner5Mile2 = MinutesForRunner5Mile2
				* SECONDS_PER_MINUTE;
		double SecondsForRunner5Mile2 = Double.parseDouble(Mile2Runner5
				.substring(Mile2Runner5.indexOf(':') + 1));
		double TotalSecondsRunner5Mile2 = SecondsForRunner5Mile2
				+ MinutesToSecondsRunner5Mile2;
		// This section prompts the user for their mile 2 time, and then converts it from a string into to a double that can be used in equations.
		System.out.println(Runner1
				+ ", Please enter your total time: (mm:ss.sss): ");
		String Mile3Runner5 = keyboard.nextLine();
		int MinutesForRunner5Mile3 = Integer.parseInt(Mile3Runner5.substring(0,
				Mile3Runner5.indexOf(':')));
		int MinutesToSecondsRunner5Mile3 = MinutesForRunner5Mile3
				* SECONDS_PER_MINUTE;
		double SecondsForRunner5Mile3 = Double.parseDouble(Mile3Runner5
				.substring(Mile3Runner5.indexOf(':') + 1));
		double TotalSecondsRunner5Mile3 = SecondsForRunner5Mile3
				+ MinutesToSecondsRunner5Mile3;
		// This section prompts the user for their mile 3 time, and then converts it from a string into to a double that can be used in equations.
		double Split1Runner5 = TotalSecondsRunner1Mile1;
		int FinalMinutesRunner5Mile1 = (int) Split1Runner5 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner5Mile1 = Split1Runner5 % SECONDS_PER_MINUTE;
		String FinalSplit1Runner5 = FinalMinutesRunner5Mile1 + ":"
				+ formatter.format(FinalSecondsRunner5Mile1);
		// This section formats the first mile into a string displayable in a chart
		double Split2Runner5 = TotalSecondsRunner5Mile2
				- TotalSecondsRunner5Mile1;
		int FinalMinutesRunner5Mile2 = (int) Split2Runner5 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner5Mile2 = Split1Runner5 % SECONDS_PER_MINUTE;
		String FinalSplit2Runner5 = FinalMinutesRunner5Mile2 + ":"
				+ formatter.format(FinalSecondsRunner5Mile2);
		// This section formats the second mile into a string displayable in a chart
		double Split3Runner5 = TotalSecondsRunner5Mile3;
		int FinalMinutesRunner5Mile3 = (int) Split3Runner5 / SECONDS_PER_MINUTE;
		double FinalSecondsRunner5Mile3 = Split3Runner5 % SECONDS_PER_MINUTE;
		String FinalSplit3Runner5 = FinalMinutesRunner5Mile3 + ":"
				+ formatter.format(FinalSecondsRunner5Mile3);
		// This section formats the third mile into a string displayable in a chart
		System.out.println("Runner Summary:");
		System.out.println("---------------");
		System.out.println(Runner5);
		System.out.printf("%-10s-%15s\n", "Split One", FinalSplit1Runner5);
		System.out.printf("%-10s-%15s\n", "Split Two", FinalSplit2Runner5);
		System.out.printf("%-10s-%15s\n", "Split Three", FinalSplit3Runner5);
		System.out.printf("%-10s-%15s\n", "Final Time", Mile3Runner5);
		// This displays all of the splits and the name of the runner
		System.out.println("------------------------------");
		
		System.out.println("Final Runner Summary");
		System.out.println("------------------------------");
		System.out.println(Runner1);
		System.out.printf("%-10s-%15s\n", "Split One", FinalSplit1Runner1);
		System.out.printf("%-10s-%15s\n", "Split Two", FinalSplit2Runner1);
		System.out.printf("%-10s-%15s\n", "Split Three", FinalSplit3Runner1);
		System.out.printf("%-10s-%15s\n", "Final Time", Mile3Runner1);

		System.out.println("------------------------------");
		
		System.out.println(Runner2);
		System.out.printf("%-10s-%15s\n", "Split One", FinalSplit1Runner2);
		System.out.printf("%-10s-%15s\n", "Split Two", FinalSplit2Runner2);
		System.out.printf("%-10s-%15s\n", "Split Three", FinalSplit3Runner2);
		System.out.printf("%-10s-%15s\n", "Final Time", Mile3Runner2);

		System.out.print("------------------------------");
		
		System.out.println(Runner3);
		System.out.printf("%-10s-%15s\n", "Split One", FinalSplit1Runner3);
		System.out.printf("%-10s-%15s\n", "Split Two", FinalSplit2Runner3);
		System.out.printf("%-10s-%15s\n", "Split Three", FinalSplit3Runner3);
		System.out.printf("%-10s-%15s\n", "Final Time", Mile3Runner3);

		System.out.println("------------------------------");
		
		System.out.println(Runner4);
		System.out.printf("%-10s-%15s\n", "Split One", FinalSplit1Runner4);
		System.out.printf("%-10s-%15s\n", "Split Two", FinalSplit2Runner4);
		System.out.printf("%-10s-%15s\n", "Split Three", FinalSplit3Runner4);
		System.out.printf("%-10s-%15s\n", "Final Time", Mile3Runner4);

		System.out.println("------------------------------");
		
		System.out.println(Runner5);
		System.out.printf("%-10s-%15s\n", "Split One", FinalSplit1Runner5);
		System.out.printf("%-10s-%15s\n", "Split Two", FinalSplit2Runner5);
		System.out.printf("%-10s-%15s\n", "Split Three", FinalSplit3Runner5);
		System.out.printf("%-10s-%15s\n", "Final Time", Mile3Runner5);

		System.out.println("------------------------------");
		// This section is the final chart, and displays all runners and their respective split
		keyboard.close();
	}

}

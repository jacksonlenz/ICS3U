package com.bayviewglen.xcountryassignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryAssignment {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	DecimalFormat formatter = new DecimalFormat("00.000");
	
	int SecondsPerMinute = 60;
	
	System.out.println("Please enter your first and last name: ");
	String Runner1 = keyboard.nextLine();
	
	System.out.println(Runner1 + ", Please enter the time for your first mile (mm:ss.sss): ");
	String Mile1Runner1 = keyboard.nextLine();
	int MinutesForRunner1Mile1 = Integer.parseInt(Mile1Runner1.substring(0, Mile1Runner1.indexOf(':')));
	int MinutesToSecondsRunner1Mile1 = MinutesForRunner1Mile1 * SecondsPerMinute;
	double SecondsForRunner1Mile1 = Double.parseDouble(Mile1Runner1.substring(Mile1Runner1.indexOf(':') + 1));
	double TotalSecondsRunner1Mile1 = SecondsForRunner1Mile1 + MinutesToSecondsRunner1Mile1;
	
	System.out.println(Runner1 + ", Please enter the time for your second mile (mm:ss.sss): ");
	String Mile2Runner1 = keyboard.nextLine();
	int MinutesForRunner1Mile2 = Integer.parseInt(Mile2Runner1.substring(0, Mile2Runner1.indexOf(':')));
	int MinutesToSecondsRunner1Mile2 = MinutesForRunner1Mile2 * SecondsPerMinute;
	double SecondsForRunner1Mile2 = Double.parseDouble(Mile2Runner1.substring(Mile2Runner1.indexOf(':') + 1));
	double TotalSecondsRunner1Mile2 = SecondsForRunner1Mile2 + MinutesToSecondsRunner1Mile2;
	
	System.out.println(Runner1 + ", Please enter your total time: (mm:ss.sss): ");
	String Mile3Runner1 = keyboard.nextLine();
	int MinutesForRunner1Mile3 = Integer.parseInt(Mile3Runner1.substring(0, Mile3Runner1.indexOf(':')));
	int MinutesToSecondsRunner1Mile3 = MinutesForRunner1Mile3 * SecondsPerMinute;
	double SecondsForRunner1Mile3 = Double.parseDouble(Mile3Runner1.substring(Mile3Runner1.indexOf(':') + 1));
	double TotalSecondsRunner1Mile3 = SecondsForRunner1Mile3 + MinutesToSecondsRunner1Mile3;
	
	double Split1Runner1 = TotalSecondsRunner1Mile1;
	int FinalMinutesRunner1Mile1 = (int)Split1Runner1 / SecondsPerMinute;
	double FinalSecondsRunner1Mile1 = Split1Runner1 % SecondsPerMinute;
	String FinalSplit1Runner1 = FinalMinutesRunner1Mile1 + ":" + formatter.format(FinalSecondsRunner1Mile1);	
	
	double Split2Runner1 = TotalSecondsRunner1Mile2 - TotalSecondsRunner1Mile1;
	int FinalMinutesRunner1Mile2 = (int)Split2Runner1 / SecondsPerMinute;
	double FinalSecondsRunner1Mile2 = Split1Runner1 % SecondsPerMinute;
	String FinalSplit2Runner1 = FinalMinutesRunner1Mile2 + ":" + formatter.format(FinalSecondsRunner1Mile2);
	
	double Split3Runner1 = TotalSecondsRunner1Mile3;
	int FinalMinutesRunner1Mile3 = (int)Split3Runner1 / SecondsPerMinute;
	double FinalSecondsRunner1Mile3 = Split3Runner1 % SecondsPerMinute;
	String FinalSplit3Runner1 = FinalMinutesRunner1Mile3 + ":" + formatter.format(FinalSecondsRunner1Mile3);
	
	System.out.println("Runner Summary:");
	System.out.println("---------------");
	System.out.println(Runner1);
	System.out.printf("%-10s-%15s\n" , "Split One" , FinalSplit1Runner1);
	System.out.printf("%-10s-%15s\n" , "Split Two" , FinalSplit2Runner1);
	System.out.printf("%-10s-%15s\n" , "Split Three" , FinalSplit3Runner1);
	System.out.printf("%-10s-%15s\n" , "Final Time" , Mile3Runner1);
	
	System.out.println("------------------------------");
	
	System.out.println("Please enter your first and last name: ");
	String Runner2 = keyboard.nextLine();
	
	System.out.println(Runner2 + ", Please enter the time for your first mile (mm:ss.sss): ");
	String Mile1Runner2 = keyboard.nextLine();
	int MinutesForRunner2Mile1 = Integer.parseInt(Mile1Runner2.substring(0, Mile1Runner2.indexOf(':')));
	int MinutesToSecondsRunner2Mile1 = MinutesForRunner2Mile1 * SecondsPerMinute;
	double SecondsForRunner2Mile1 = Double.parseDouble(Mile1Runner2.substring(Mile1Runner2.indexOf(':') + 1));
	double TotalSecondsRunner2Mile1 = SecondsForRunner2Mile1 + MinutesToSecondsRunner2Mile1;
	
	System.out.println(Runner2 + ", Please enter the time for your second mile (mm:ss.sss): ");
	String Mile2Runner2 = keyboard.nextLine();
	int MinutesForRunner2Mile2 = Integer.parseInt(Mile2Runner2.substring(0, Mile2Runner2.indexOf(':')));
	int MinutesToSecondsRunner2Mile2 = MinutesForRunner2Mile2 * SecondsPerMinute;
	double SecondsForRunner2Mile2 = Double.parseDouble(Mile2Runner2.substring(Mile2Runner2.indexOf(':') + 1));
	double TotalSecondsRunner2Mile2 = SecondsForRunner2Mile2 + MinutesToSecondsRunner2Mile2;
	
	System.out.println(Runner2 + ", Please enter your total time: (mm:ss.sss): ");
	String Mile3Runner2 = keyboard.nextLine();
	int MinutesForRunner2Mile3 = Integer.parseInt(Mile3Runner2.substring(0, Mile3Runner2.indexOf(':')));
	int MinutesToSecondsRunner2Mile3 = MinutesForRunner2Mile3 * SecondsPerMinute;
	double SecondsForRunner2Mile3 = Double.parseDouble(Mile3Runner2.substring(Mile3Runner2.indexOf(':') + 1));
	double TotalSecondsRunner2Mile3 = SecondsForRunner2Mile3 + MinutesToSecondsRunner2Mile3;
	
	double Split1Runner2 = TotalSecondsRunner2Mile1;
	int FinalMinutesRunner2Mile1 = (int)Split1Runner2 / SecondsPerMinute;
	double FinalSecondsRunner2Mile1 = Split1Runner2 % SecondsPerMinute;
	String FinalSplit1Runner2 = FinalMinutesRunner2Mile1 + ":" + formatter.format(FinalSecondsRunner2Mile1);	
	
	double Split2Runner2 = TotalSecondsRunner2Mile2 - TotalSecondsRunner2Mile1;
	int FinalMinutesRunner2Mile2 = (int)Split2Runner2 / SecondsPerMinute;
	double FinalSecondsRunner2Mile2 = Split1Runner2 % SecondsPerMinute;
	String FinalSplit2Runner2 = FinalMinutesRunner2Mile2 + ":" + formatter.format(FinalSecondsRunner2Mile2);
	
	double Split3Runner2 = TotalSecondsRunner2Mile3;
	int FinalMinutesRunner2Mile3 = (int)Split3Runner2 / SecondsPerMinute;
	double FinalSecondsRunner2Mile3 = Split3Runner2 % SecondsPerMinute;
	String FinalSplit3Runner2 = FinalMinutesRunner2Mile3 + ":" + formatter.format(FinalSecondsRunner2Mile3);
	
	System.out.println("Runner Summary:");
	System.out.println("---------------");
	System.out.println(Runner1);
	System.out.printf("%-10s-%15s\n" , "Split One" , FinalSplit1Runner2);
	System.out.printf("%-10s-%15s\n" , "Split Two" , FinalSplit2Runner2);
	System.out.printf("%-10s-%15s\n" , "Split Three" , FinalSplit3Runner2);
	System.out.printf("%-10s-%15s\n" , "Final Time" , Mile3Runner2);
	
	System.out.print("------------------------------");
	
	
	
	
	
	
		
		
		
		
		
		
	keyboard.close();
	}

}

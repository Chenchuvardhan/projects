package com.jagannadh;

import java.util.Scanner;

/*
 A fitness tracking app stores the number of steps taken by a user over
10 days. The app wants to show the user their total step count and average
daily steps.
Requirement:
Write a Java program that stores the number of steps for 10 days in an array,
calculates the total steps and average steps per day, and displays the result.
*/
public class FitNess {
	public static void countSteps(int[] steps) {
		int count=0;
		for(int i:steps) {
			count+=i;
		}
		System.out.println("total steps :"+count);
		averageStep(steps.length, count);
	}
	public static void averageStep(int length,int count) {
		System.out.println("average steps :"+count/length);
	}
public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
		int[] day=new int[5];
		System.out.println("Enter your steps daya by day");
		for(int i=0;i<day.length;i++) {
			System.out.println("day "+(i+1)+" :");
			day[i]=scanner.nextInt();
		}
		countSteps(day);
	}
	
}
}

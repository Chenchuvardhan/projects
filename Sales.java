package com.jagannadh;

/*
A retail store records the number of items sold per day over a week.
Management wants to analyze on which day the least number of items were sold.
Requirement:
Write a Java program that takes the number of items sold each day for 7
days in an array and finds the minimum value among them, representing the
day with the least sales.
*/
public class Sales {
	public static void main(String[] args) {
		String sunday, monday, tuesday, wednesday, thursday, friday, saturday;
		sunday = "sunday";
		monday = "monday";
		tuesday = "tuesday";
		wednesday = "wednesday";
		thursday = "thursday";
		friday = "friday";
		saturday = "saturday";
		int[] sales = { 78, 90, 34, 134, 456, 30, 230 };
		int least = sales[0];
		for (int i : sales) {

			if (i < least) {
				least = i;
			}
		}
		System.out.println(least);
		int day = -1;
		for (int i = 0; i < sales.length; i++) {
			if (sales[i] == least)
				day = i + 1;
		}
		switch (day) {
		case 1:
			System.out.println("Least sales in " + "monday :" + least);
			break;
		case 2:
			System.out.println("Least sales in " + "tuesday :" + least);
			break;
		case 3:
			System.out.println("Least sales in " + "wednesday :" + least);
			break;
		case 4:
			System.out.println("Least sales in " + "thursday :" + least);
			break;
		case 5:
			System.out.println("Least sales in " + "friday :" + least);
			break;
		case 6:
			System.out.println("Least sales in " + "saturday :" + least);
			break;
		case 7:
			System.out.println("Least sales in " + "sunday :" + least);
			break;
		}
	}
}

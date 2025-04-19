package com.technolabs;

public class GetMonthFromDate {
	public static void main(String[] args) {
		String str = "12-09-2024";
		String[] split = str.split("-");
		String string = split[1];
		int month = Integer.parseInt(string);
		System.out.println(month);
		switch (month) {
		case 1:
			System.out.println("January Month");
			break;
		case 2:
			System.out.println("February Month");
			break;
		case 3:
			System.out.println("March Month");
			break;
		case 4:
			System.out.println("April Month");
			break;
		case 5:
			System.out.println("May Month");
			break;
		case 6:
			System.out.println("June Month");
			break;
		case 7:
			System.out.println("July Month");
			break;
		case 8:
			System.out.println("August Month");
			break;
		case 9:
			System.out.println("September Month");
			break;
		case 10:
			System.out.println("October Month");
			break;
		case 11:
			System.out.println("November Month");
			break;
		case 12:
			System.out.println("Decemeber Month");
			break;
		default:
			System.out.println("There is No Month");
		}
	}
}

package com.jagannadh;

import java.util.Scanner;

interface DispalyNumberAsWord {
	public abstract String takeNumber(int a);
}

public class DisplayNumberInWord {
	public static void main(String[] args) {
		DispalyNumberAsWord d = (a) -> {
			String word[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
			return word[a];
		};
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number :");
		while (true) {

			int var = scn.nextInt();
			if (var > -1 && var < 10) {
				System.out.println(d.takeNumber(var));
				break;
			} else {
				System.out.println("Try Again ...");
				System.out.println("Enter Number :");
			}
		}
		scn.close();
	}
}

package com.technolabs;

import java.util.Scanner;

public class ReplaceFirsetletterInASentenceEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Quote :");
		String sentence=scanner.nextLine();
		scanner.close();
		//String sentence = "  Lion    is  a      wild  animal      ";
		//System.out.println(sentence);
		String removeSpace = sentence.trim();
		//System.out.println(removeSpace);
		StringBuilder output = new StringBuilder("");
		while (removeSpace.contains(" ")) {
			//System.out.println(removeSpace);
			int indexOf = removeSpace.indexOf(" ");
			//System.out.println(indexOf);
			String substring = removeSpace.substring(0, indexOf);
			removeSpace = removeSpace.substring(indexOf).trim();
			//System.out.println(removeSpace);
			//System.out.println(substring);
			String string;
			if(substring.length()>1) {
			 string="_" + substring.substring(1);
			}
			else {
				string="_";
			}
			//System.out.println(string);
			output.append(string+ " ");
		}
		output.append(" _"+removeSpace.substring(1));
		System.out.println(output);
	}

}

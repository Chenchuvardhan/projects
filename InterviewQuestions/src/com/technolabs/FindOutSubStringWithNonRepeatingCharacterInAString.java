package com.technolabs;

import java.util.ArrayList;

public class FindOutSubStringWithNonRepeatingCharacterInAString {
	public static void main(String[] args) {
		String input = "abccebca";
		ArrayList<Character> list = new ArrayList<>();
		String modified = "";

		for (int i=0,j=i+1; i < input.length()&&j<input.length()-2; i++,j++) {
			System.out.println("i "+i+"-"+"j "+j);
			if (input.charAt(i) == input.charAt(j)) {
				list.add(input.charAt(i));
				modified += modified.charAt(i);
			} else {
				modified += modified.charAt(i);
			}
		}
		System.out.println(modified);
	}
}

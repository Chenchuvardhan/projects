package com.mphasis;

import java.util.Set;
import java.util.TreeSet;

public class FindNubersAndArrangeAscendOrderInString {
	public static void main(String[] args) {
		String input = "a1b23c45d6e789f";
		char[] charArray = input.toCharArray();
		Set<Integer> set = new TreeSet<Integer>();
		StringBuilder builder = new StringBuilder();
		for (char c : charArray) {
			if (Character.isDigit(c))
				builder.append(c);
			else {
				if (builder.length() > 0) {
					set.add(Integer.parseInt(builder.toString()));
				}
				builder.setLength(0);
			}
		}
		System.out.println(set);
	}
}

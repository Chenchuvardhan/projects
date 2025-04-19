package com.technolabs;

import java.util.Arrays;

public class ReplaceEachWordFirstLetterWith_InASentence {
public static void main(String[] args) {
	String input="Chair    made   by   wood";
	System.out.println(input);
	System.out.println(ReplaceEachWordStartingLetterWith_InASentence(input));
}
public static String ReplaceEachWordStartingLetterWith_InASentence(String input) {
	String[] split = input.split(" ");
	StringBuilder output = new StringBuilder("");
	Arrays.stream(split).map(word->word.replace(word.charAt(0), '_')).forEach(word->output.append(word+" "));
	return output.toString();
	/*
	 * return Arrays.stream(input.split(" "))
	 * .map(word -> "_" + word.substring(1))
	 * .collect(Collectors.joining(" "));
	 */
}
}

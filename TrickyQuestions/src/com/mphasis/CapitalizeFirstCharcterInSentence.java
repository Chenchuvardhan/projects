package com.mphasis;

public class CapitalizeFirstCharcterInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String sentence="java interview questions";
     String[] split = sentence.split(" ");
     StringBuilder builder=new StringBuilder();
     for(String word:split) {
    	 char upperCase = Character.toUpperCase(word.charAt(0));
    	 String replace = word.replace(word.charAt(0), upperCase);
    	 builder.append(replace+" ");
     }
     System.out.println(builder);
	}

}

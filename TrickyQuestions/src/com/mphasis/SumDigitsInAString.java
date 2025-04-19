package com.mphasis;

public class SumDigitsInAString {
	public static void main(String[] args) {
     System.out.println("java154@gmail.com".chars().mapToObj(i->(char)i).filter(i->Character.isDigit(i)).mapToInt(i->Character.getNumericValue(i)).sum());
	}
}

package com.mphasis;

public class ArmStrongNumber {
	public static void main(String[] args) {
		
		if (Double.parseDouble("88593477") == "88593477".chars().mapToObj(i -> (char) i).map(i -> Character.getNumericValue(i))
				.map(i -> Math.pow(i, "88593477".length())).mapToDouble(i -> i).sum())
			System.out.println("88593477" + " is a armstrong number");
		else
		System.out.println("88593477"+" is not a armstrong number");
	}
}

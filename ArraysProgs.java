package com.jagannadh;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

/*
 *Wap to allow the user to specify how many elements has to be stored.
 *Operations :
 *1.Display all elements
 * 2.display the Positive elements
 * 3.display the negative elements
 * 4.display the all sum of elements
 * 5.display elements which are divisible by 2 and 3
 */ public class ArraysProgs {
	public static void displayAllElements(int[] input) {
     System.out.println(Arrays.toString(input));
	}
    public static void displayPositiveElements(int[] input) {
    	System.out.println("Positive Values are :");
    	for(int i:input) {
    		if(i>0)
    			System.out.println(i);
    	}	
    }
    public static void displayNegativeElements(int[] input) {
		System.out.println("Negative Values are :");

    	for(int i:input) {
    		if(i<0)
    			System.out.println(i);
    	}	
	} 
    public static void sumOfAll(int[] input) {
        System.out.println("Sum of All Digits are  :"+Arrays.stream(input).sum());
    }
    public static void displayNumberDivisibleBy2And3(int[] input) {
    	System.out.println("The Numbers are divisible By 2 And 3");
    	Arrays.stream(input).filter(a->(a%2==0&&a%3==0)).forEach(System.out::println);
    }
	public static void main(String[] args) {
		System.out.println("How many you want to store");
		Scanner scanner = new Scanner(System.in);
		try (scanner) {
			int[] arr = new int[scanner.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter your value at "+(i+1)+" position");
				arr[i] = scanner.nextInt();
			}
			displayAllElements(arr);
			displayNegativeElements(arr);
			displayPositiveElements(arr);
			displayNumberDivisibleBy2And3(arr);
			sumOfAll(arr);
			var a=10;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

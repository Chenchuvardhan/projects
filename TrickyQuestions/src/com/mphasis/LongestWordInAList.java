package com.mphasis;

import java.util.Comparator;
import java.util.List;

public class LongestWordInAList {
	public static void main(String[] args) {
   System.out.println(List.of("Banana", "Avagadro", "Mango", "WaterMelon", "Apple", "Orange", "Pineaple", "Grape", "Papaya", "JackFruit").stream().max(Comparator.comparing(String::length)).get());
	}
}

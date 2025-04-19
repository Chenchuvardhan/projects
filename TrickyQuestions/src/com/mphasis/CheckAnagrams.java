package com.mphasis;

import java.util.stream.Collectors;

public class CheckAnagrams {
	public static void main(String[] args) {
     String str1="listen";
     String str2="silent";
     System.out.println(str1.chars().sorted().boxed().collect(Collectors.toList()).equals(str2.chars().sorted().boxed().collect(Collectors.toList())));
	}
}

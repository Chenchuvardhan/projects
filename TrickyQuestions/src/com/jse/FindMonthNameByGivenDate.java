package com.jse;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMonthNameByGivenDate {
	public static void main(String[] args) {
		String str = "helloworld";
		Long collect = str.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue() > 1).map(i -> i.getKey() + "").count();
		System.out.println(collect);
	  int k=10210;
	   if((k+"").chars().mapToObj(i->(char)i).allMatch(i->i=='1'||i=='0'))
		   System.out.println(k+" is a Binary number");
	   else
	   System.out.println(k+" is not a Binary Number");
	   reverseString();
	}
	public static void reverseString() {
		/*
		 * String str = "Hello Java 8"; String collect =
		 * str.chars().mapToObj(i->(char)i+"").sorted((i,j)->-1).collect(Collectors.
		 * joining()); System.out.println(collect);
		 */
		 List<String> asList = Arrays.asList("java","python",".Net","Html","javascript");
		 String set = asList.set(0,"Linux");
		 System.out.println(asList.get(0));
		 List<String> of = List.of("java","Python",".Net","Html","javascript");
		// of.add("Linux");
		 System.out.println(of);
	}
}

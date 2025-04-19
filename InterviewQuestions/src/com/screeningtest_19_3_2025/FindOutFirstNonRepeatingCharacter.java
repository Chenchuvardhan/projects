package com.screeningtest_19_3_2025;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindOutFirstNonRepeatingCharacter {
public static void main(String[] args) {
	String str="helloeveryoneh";
	IntStream chars = str.chars();
	LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();
	chars.forEach(i->{
		if(!linkedHashMap.containsKey((char)i))
			linkedHashMap.put((char)i, 1);
		else
			linkedHashMap.put((char)i,linkedHashMap.get((char)i)+1);
	});
	Set<Entry<Character,Integer>> entrySet = linkedHashMap.entrySet();
	Entry<Character, Integer> entry = entrySet.stream().filter(i->i.getValue()==1).findFirst().get();
	System.out.println(entry.getKey());
	System.out.println(linkedHashMap);
}
}

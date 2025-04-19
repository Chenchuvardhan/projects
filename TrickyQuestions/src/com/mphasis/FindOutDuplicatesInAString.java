package com.mphasis;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOutDuplicatesInAString {
	public static void main(String[] args) {
    String str="malayalam";
    List<Character> collect = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>1).map(i->i.getKey()).collect(Collectors.toList());
    System.out.println(collect);
	}
}

package com.screeningtest_19_3_2025;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EveryCharacterCountInAStringJava8 {
	public static void main(String[] args) {
    String str="Malayalm";
    str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()==1).forEach(i->System.out.println(i.getKey()+"-"+i.getValue()));
	}
}

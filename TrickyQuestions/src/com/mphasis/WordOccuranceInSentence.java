package com.mphasis;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccuranceInSentence {
	public static void main(String[] args) {
    String sentence="Java is awesome and Java is powerful";
    String[] split = sentence.split(" ");
    LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
    Arrays.stream(split).forEach(word->{
    	if(linkedHashMap.containsKey(word))
    		linkedHashMap.put(word, linkedHashMap.get(word)+1);
    	else
    		linkedHashMap.put(word, 1);

    });
    System.out.println(linkedHashMap);
    LinkedHashMap<String,Long> collect = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
    System.out.println(collect.entrySet().stream().sorted((i,j)->j.getValue().compareTo(i.getValue())).skip(1).findFirst().get());
	}
}

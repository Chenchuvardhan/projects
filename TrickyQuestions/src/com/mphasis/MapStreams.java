package com.mphasis;

import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapStreams {
public static void main(String[] args) {
	Map<String,Integer> map=new LinkedHashMap<>();
	map.put("apple", 30);
	map.put("Banana", 20);
	map.put("Mango", 60);
	map.put("Papaya", 40);
	map.put("StrawBerry",35);
	map.put("Grapes", 25);
	System.out.println("Before Sorting "+map);
	map.entrySet().stream().sorted((a,b)->a.getValue().compareTo(b.getValue())).limit(3).map(a->a.getKey()).toList().forEach(System.out::print);
	IntSummaryStatistics summaryStatistics = map.values().stream().mapToInt(Integer::valueOf).summaryStatistics();
	System.out.println(summaryStatistics.getCount());
	System.out.println(summaryStatistics.getMax());
	System.out.println(summaryStatistics.getAverage());
	System.out.println(summaryStatistics.getMin());
}
}

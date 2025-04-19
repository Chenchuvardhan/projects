package com.screeningtest_19_3_2025;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTask {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Apple", 150);
		map.put("Banana", 200);
		map.put("Avacadro", 230);
		map.put("Mango", 300);
		map.put("Almin", 180);
		System.out.println("The Fruits Cost StartsWith 'A' :");
		map.entrySet().stream().filter(i -> i.getKey().startsWith("A")).forEach(i -> System.out.println(i.getValue()));
        Map<String,Integer> collect = map.entrySet().stream().filter(i -> i.getKey().startsWith("A")).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(collect);
	}
}

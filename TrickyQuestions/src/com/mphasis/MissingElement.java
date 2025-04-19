package com.mphasis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class MissingElement {
	public static void main(String[] args) {
		int[] input = { 7, 9, 6, 8, 3, 4, 2, 1, 6, 9, 4, 8, 8, 7 };
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		Arrays.stream(input).forEach(i -> treeSet.add(i));
		for (int i = treeSet.first(); i < treeSet.last(); i++) {
	       if(!treeSet.contains(i))
	    	   System.out.println(i);
		}
		long sum = Arrays.asList(6,3,5,10,8,78,65).stream().mapToInt(Integer::valueOf).summaryStatistics().getSum();
		System.out.println(sum);
		long max = Arrays.asList(6,3,5,10,8,78,65).stream().mapToInt(Integer::valueOf).summaryStatistics().getMax();
		System.out.println(max);
		long min = Arrays.asList(6,3,5,10,8,78,65).stream().mapToInt(Integer::valueOf).summaryStatistics().getMin();
        System.out.println(min);
        double average = Arrays.asList(6,3,5,10,8,78,65).stream().mapToInt(Integer::valueOf).summaryStatistics().getAverage();
        System.out.println(average);
	}
}

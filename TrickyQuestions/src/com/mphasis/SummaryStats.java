package com.mphasis;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SummaryStats {
public static void main(String[] args) {
	Stream<Integer> of = Stream.of(7,8,8,4,2,9,1);
	IntSummaryStatistics summaryStatistics = of.mapToInt(Integer::valueOf).summaryStatistics();
	IntSummaryStatistics summaryStatistics2 = List.of(4,5,6,71,2,8,9,11).stream().mapToInt(Integer::valueOf).summaryStatistics();
	System.out.println(summaryStatistics);
	

}
}

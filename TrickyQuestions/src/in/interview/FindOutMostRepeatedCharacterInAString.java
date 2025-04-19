package in.interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOutMostRepeatedCharacterInAString {
	public static void main(String[] args) {
      String str="java";
      System.out.println(str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get());
	}
}

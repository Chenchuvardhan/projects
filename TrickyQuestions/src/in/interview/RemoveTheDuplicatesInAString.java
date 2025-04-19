package in.interview;

import java.util.stream.Collectors;

public class RemoveTheDuplicatesInAString {
	public static void main(String[] args) {
    String str="java";
    String collect = str.chars().distinct().mapToObj(i->(char)i+"").collect(Collectors.joining());
    System.out.println(collect);
	}
}

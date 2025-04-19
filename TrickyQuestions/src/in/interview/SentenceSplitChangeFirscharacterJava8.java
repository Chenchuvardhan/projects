package in.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SentenceSplitChangeFirscharacterJava8 {
	public static void main(String[] args) {
		String input = "Lion is a animal";
	    String collect = Arrays.stream(input.split(" ")).map(i->"_"+i.substring(1)).collect(Collectors.joining(" "));
	    System.out.println(collect);
	}
}

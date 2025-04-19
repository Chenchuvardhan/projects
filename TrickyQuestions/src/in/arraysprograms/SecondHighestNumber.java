package in.arraysprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SecondHighestNumber {
public static void main(String[] args) {
	int[] numbers= {1,2,3,4,5,5,6,6,7,8,8,9,9,0,-1,-2,-3};
	Stream<Integer> boxed = Arrays.stream(numbers).distinct().boxed();
	Integer integer = boxed.sorted(Comparator.comparingInt(Integer::valueOf)).skip(1).findFirst().get();
	System.out.println(integer);
	
}
}

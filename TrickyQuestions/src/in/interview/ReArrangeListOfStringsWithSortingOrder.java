package in.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReArrangeListOfStringsWithSortingOrder {
	public static void main(String[] args) {
     List<String> of = List.of("java34",".net4","python2","go3","ruby8");
     System.out.println(of.getClass().getName());
     List<String> collect = of.stream().sorted(Comparator.comparing(a->Integer.parseInt(a.replaceAll("\\D","")))).collect(Collectors.toList());
     System.out.println(collect);
     String str="    java    is      a   programming  language  ";
     String[] split = str.trim().split("\\s+");
     System.out.println(Arrays.toString(split));
	}
}

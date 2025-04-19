package com.mphasis;

import java.util.stream.Collectors;

public class ReverseStringJav8 {
public static void main(String[] args) {
	String str="Harikrishna";
	String collect = str.chars().mapToObj(i->(char)i+"").sorted((i,j)->0).collect(Collectors.joining());
	System.out.println(collect);
}
}

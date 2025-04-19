package com.jse;

public class Tester {
	public static void main(String[] args) {
    int i=1010;
    (i+"").chars().mapToObj(k->(char)k).forEach(System.out::print);
    Character ch='A';
    System.out.println(ch);
	}
}

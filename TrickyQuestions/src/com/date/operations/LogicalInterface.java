package com.date.operations;

import java.util.List;
import java.util.stream.Collectors;

public interface LogicalInterface {
	public abstract void m1();

	public abstract void m2();

	public static void main(String[] args) {
     System.out.println(List.of("go","ruby",".net","python","java").stream().collect(Collectors.joining(", ")));
	}
}

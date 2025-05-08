package com.jagannadh;

public class MaxElemnet {
	public static int findMax(int... numbers) {
		int i = 0;
		if (numbers.length == 0)
			return i;
		else {
			i = numbers[0];
			for (int max : numbers)
				if (max > i)
					i = max;
		}
		return i;
	}

	public static void main(String[] args) {
    System.out.println(findMax(1));
	}
}

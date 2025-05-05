package com.jagannadh;
/*
Q7)  A retail store maintains a list of product IDs in an array. Sometimes,
due to system glitches,the same product ID is recorded multiple times.
Write a Java program to count how many product IDs are repeated
(appear more than once).
Example Input:
int[] productIds = {101, 102, 103, 101, 104, 105, 102};
Expected Output:
2 product IDs are repeated.
*/

import java.util.Arrays;

class RetailStore {
	int[] productIds;

	public void repeatedProductIds(int[] ids) {
		Arrays.sort(ids);
		
		int repeated = 0;
		for (int i = 0; i < ids.length; i++) {
			int count = 1;
			for (int k = i + 1; k < ids.length; k++) {
				if (ids[i] == ids[k]) {
					count = count + 1;
				}
			}
			if (count > 1) {
				repeated++;
			}
		}
		System.out.println("Output :\n"+repeated + " products are repeated");
	}
}

public class ReatilStoreService {
	public static void main(String[] args) {
		int[] productIds = { 101, 101, 101, 101, 101, 101, 101 };
		RetailStore store = new RetailStore();
		store.repeatedProductIds(productIds);
	}
}

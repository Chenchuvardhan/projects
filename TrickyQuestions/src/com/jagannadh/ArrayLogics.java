package com.jagannadh;

import java.util.Arrays;

/*
 *WAP (Write A Program) to find Largest and Smallest Element in an Array
 * 
 * 
 * 
 * 
 */
public class ArrayLogics {
	public static void findLargestAndSmallest(int[] values) {
		System.out.println("Given Array :" + Arrays.toString(values));
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] > values[j]) {
					int max = values[i];
					values[i] = values[j];
					values[j] = max;
				}
			}
		}
		int count = 0;
		int min;
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				count = j;
				if (values[i] > values[j]) {
					min = values[j];
					values[i] = values[j];
				}
			}
		}
		System.out.println("After Sort :" + Arrays.toString(values));
		System.out.println("smallest :" + values[0]);
		System.out.println("largest :" + values[values.length - 1]);

	}

	public static void findDuplicates(int[] values) {
		int dups[] = new int[values.length / 2];
		int store = 0;
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] == values[j]) {
					boolean isPresent = false;
					for (int l = 0; l < dups.length; l++) {
						if (dups[l] == values[i]) {
							isPresent = true;
							if (!isPresent) {
								dups[store] = values[i];
								store++;
							}
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(dups));
	}

	public static void reverseArray(int[] values) {
        System.out.println(Arrays.toString(values));
              for(int i=0;i<values.length;i++) {
            	  for(int j=values.length-1;j>-1;j--) {
            		  int val=values[i];
            		  values[i]=values[j];
            		  values[j]=val;
            	  }
              }
              System.out.println(Arrays.toString(values));
	}

	public static void main(String[] args) {
		// findLargestAndSmallest(new int[] {23,78,34,56,6,89,65,34,56,21,76});
		// findDuplicates(new int[] { 23, 78, 34, 56, 6, 89, 65, 34, 56, 21, 76 });
		reverseArray(new int[] { 23, 78, 34, 56, 6, 89, 65, 34, 56, 21, 76 });
	}
}

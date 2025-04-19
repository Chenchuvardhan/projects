package com.mphasis;

public class FibonaciiSeries {
public static void main(String[] args) {
	int i=0;
	int k=1;
	System.out.print(i+" "+k+" ");
	while(i<100) {
		int j=i+k;
		System.out.print(j+" ");
		i=k;
		k=j;
	}
}
}

package com.mphasis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MoveAllZeroesLastSide {
public static void main(String[] args) {
	int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
	List<Integer> list=new ArrayList<>();
	List<Integer> list2=new ArrayList<>();
	for(int i:arr) {
	if(i==0)
		list.add(0);
	else
		list2.add(i);
	}
	int[] output=new int[list.size()+list2.size()];
	int u=0;
		for(int i:list2) {
			output[u]=i;
			u++;
		}
	for(int i:list) {
	output[u]=i;
	}
	System.out.println(Arrays.toString(output));
}
}

package com.technolabs;

public class BinaryNumberOrNot {
public static void main(String[] args) {
	int input=123;
	String str=input+"";
	boolean isBinary=true;
	for(int i=0;i<str.length();i++) {
		if(!(str.charAt(i)=='0'||str.charAt(i)=='1')) {
			isBinary=false;
			break;
		}
	}
	if(isBinary) {
		System.out.println(input+" is a binary number");
	}
	else {
		System.out.println(input+" is not a binary number");
	}
}
}

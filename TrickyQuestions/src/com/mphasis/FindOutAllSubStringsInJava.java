package com.mphasis;

public class FindOutAllSubStringsInJava {
	public static void main(String[] args) {
    String str="abc";
    for(int i=0;i<str.length();i++) {
    	for(int j=i+1;j<=str.length();j++){
    		System.out.print(str.substring(i,j)+ " ");
    	}
    }
	}
}

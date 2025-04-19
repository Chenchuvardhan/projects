package com.mphasis;

public class SwapUsingThirdVar {
	public static void main(String[] args) {
    int a=5,b=6,c=a;
    a=b;
    b=c;
    System.out.println(a+""+b);
    int x=5,y=6;
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println(x+""+y);

	}
	
}

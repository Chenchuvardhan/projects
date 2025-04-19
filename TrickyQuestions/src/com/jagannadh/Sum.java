package com.jagannadh;

public class Sum {
	public static double sumOfDoubles(double... values) {
		try {
		double a=0;
	 if(values.length!=0) 
	 for(double value:values) 
	  a+=value;
	 else 
		 System.out.print("Operation Fail Due to you did not pass Values \nYour Score is ");
	return a;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(sumOfDoubles(1,2,3,4));
	}
}

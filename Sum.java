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
<<<<<<< HEAD
                   System.out.println("Exception Handled");
=======
			System.out.println("Exception Handled");
>>>>>>> 09dfb9e20a14b98f345f5928a2c5c15e5736c344
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(sumOfDoubles(1,2,3,4));
	}
}

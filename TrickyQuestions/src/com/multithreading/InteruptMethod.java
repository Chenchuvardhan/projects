package com.multithreading;

public class InteruptMethod implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am Ready for an Interview");
		for(int i=1;i<=5;i++)
			System.out.println("This is My "+i+" interview");
		System.out.println("I got placed i went to relax");
		try {
			Thread.sleep(2000);
			System.out.println("Hai Thread ...");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("My Sleep got disturbed");
		}
		System.out.println("It's time to Go to Office...");
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new InteruptMethod());
		thread.start();
		//thread.interrupt();
		String str="java";
	   System.out.println(new StringBuffer(str).
		reverse().toString());
	}
}

package com.multithreading;

public class YieldTest {
	public static void main(String[] args) {
   YeildMethod yeildMethod = new YeildMethod();
   Thread t=new Thread(yeildMethod);
   t.setPriority(10);
   t.start();
   Thread.yield();
   for(int i=1;i<6;i++) {
	   System.out.println("YeildTest");
   }
	}
}

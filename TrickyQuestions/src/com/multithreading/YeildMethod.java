package com.multithreading;

public class YeildMethod implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=1;i<6;i++)
		System.out.println("YeildMethod");
	}
}

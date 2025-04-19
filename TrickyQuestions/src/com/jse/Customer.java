package com.jse;

public class Customer implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++)  {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);

		t1.setName("chenchu");
		t1.start();
		
		t2.setName("venakatesh");
		t2.setPriority(10);
		t2.start();
	}
}

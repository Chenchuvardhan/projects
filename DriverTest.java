package com.jagannadh;
/*
 * Vehicle and Driver
1.WAP for the below requirements:
Create an interface 'Vehicle'
Operations of Vehicle:
  start()
  stop()
 Create an implementation class where sub class(sub class name - Driver)
 developer is forced to complete the operations.
 Create a main class and invoke the operations to be performed.
 */
interface Vehiicle{
public abstract void start();
public abstract void  stop();

}
class Bikes implements Vehiicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
class Driver implements Vehiicle{
     Vehiicle vehicle;
     
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("vehile started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("vechile stopped");
	}
	
}
public class DriverTest{
	public static void main(String[] args) {
		
	}
}


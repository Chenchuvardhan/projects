package com.jse;

public class Part implements AutoCloseable
{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)  {
		Part p=new Part();
		try(p){
		} catch(IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		Runnable r1=()->{System.out.println("runner");};
		Thread t1=new Thread(r1);
		t1.start();
		
	}

}

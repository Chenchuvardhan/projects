package com.jagannadh;
/*
 Create One FunctionalInterface Which will take One Argument 
 in in abstract method  and you need to provide implementation.
 */
interface Photo {
	public abstract void sendPhoto(String filepath);
}
interface Post {
	public abstract void sendPost();
}
interface  CheckIsEven{
	
}
public class Telegram {
	public static void main(String[] args) {
		Photo p = new Photo() {

			@Override
			public void sendPhoto(String filepath) {
				// TODO Auto-generated method stub
				System.out.println("Photo Sent");
			}
		};
		Photo image=a->{
			System.out.println("Photo Unable to Sent");
		};
		image.sendPhoto("K:/images//");
		p.sendPhoto("D:/filepath");
		Post h=()->{System.out.println("Post sent");};
		h.sendPost();
	}
}

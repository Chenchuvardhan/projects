package com.mphasis;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionStream {
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param <T>
 * @param args
 */
public static <T> void main(String[] args) {
	Function<Integer, Boolean> isPrime= new Function<Integer, Boolean>() {
		
		@Override
		public Boolean apply(Integer t) {
			// TODO Auto-generated method stub
			boolean isPrime=true;
			for(int k=2;k<t;k++) {
				if(t%k==0) {
					isPrime=false;
					break;
				}
					
			}
			return isPrime;
		}
	};
	System.out.println(isPrime.apply(10));
	Consumer<Integer> consumer=new Consumer<Integer>() {
		
		@Override
		public void accept(Integer t) {
			// TODO Auto-generated method stub
			System.out.println(t);
		}
	};
	consumer.accept(0);
	Supplier<Integer> supply=new Supplier<Integer>() {
		
		@Override
		public Integer get() {
			// TODO Auto-generated method stub
			return null;
		}
	};
}
}

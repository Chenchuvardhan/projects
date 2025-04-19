package com.mphasis;

import java.util.function.Predicate;

public class CheckPrime {
public static void main(String[] args) {
	Predicate<Integer> isPrime=new Predicate<>() {
		@Override
		public boolean test(Integer t) {
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
	System.out.println(isPrime.test(3));
}
}

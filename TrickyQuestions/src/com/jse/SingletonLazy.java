package com.jse;

public class SingletonLazy {
private static SingletonLazy singleton;
private SingletonLazy() {}
public static SingletonLazy getSingleTonLazy() {
	if(singleton==null) {
		synchronized (SingletonLazy.class) {
			if(singleton==null) {
				singleton=new SingletonLazy();
			}
		}
	}
	return singleton;
}
public static void main(String[] args) {
	SingletonLazy singleTonLazy = SingletonLazy.getSingleTonLazy();
}
}

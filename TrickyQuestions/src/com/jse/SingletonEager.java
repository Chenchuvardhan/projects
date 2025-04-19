package com.jse;

public class SingletonEager {
	static {
		singletonEager=new SingletonEager();
	}
private static final SingletonEager singletonEager;
private SingletonEager() {
	
}
public SingletonEager getEagerInstance() {
	return singletonEager;
}
}

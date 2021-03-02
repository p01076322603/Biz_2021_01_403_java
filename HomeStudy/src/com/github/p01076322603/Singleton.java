package com.github.p01076322603;

public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton() {}

	public static Singleton getInstance() {
		return instance;
	}
}

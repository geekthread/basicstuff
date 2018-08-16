package com.ankit.collections.arrays;

public class PrintOddEven {

	public static void main(String args[]) throws InterruptedException {
		Object lock = new Object();
		
		Thread odd = new Thread(new Odd(lock));
		Thread even = new Thread(new Even(lock));

		odd.start();
		even.start();
		
		
	}
}
package com.ankit.collections.arrays;

public class TimeArrays {
	public static void main(String[] args) {
		//int something = 2;
		long starttime = System.currentTimeMillis();
		
		for(int i=0; i<=args.length-1; i++){
			System.out.println("args :" + i +": " + args[i]);
		}
		long midTime = System.currentTimeMillis();
		
		for(int i=args.length-1;i>=0;i--){
			System.out.println("args :" + i +": " + args[i]);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Increasing Delta: " + (midTime - starttime));
		System.out.println("Decreasing Delta: " + (endTime - midTime));
	}

}

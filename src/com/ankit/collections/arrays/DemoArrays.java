package com.ankit.collections.arrays;

public class DemoArrays {
	public static void main(String[] args) {
		System.out.println("Hi");
		for(int i =0; i < args.length; i++){
			//Array indices cannot be long
			System.out.println("Arg " + i + ": " + args[ i]);
		}
	}

}

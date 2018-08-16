package com.ankit;

public class DemoSyntheticConstructs {
	
	public void showDemo(){
		NestedClass obj = new NestedClass();
		System.out.println(obj.str);
		System.out.println(obj.str1);
		System.out.println(obj.str2);
	}
	
	
	private final class NestedClass{
		private final String str = "Non Static Nesed Class is also known as Inner Class";
		private final String str1 = "Inner Classes have 2 other types";
		private final String str2 = "Named as Local and Anonymus Class";
	}

	
	public static void main(String[] args) {
		DemoSyntheticConstructs mainObj = new DemoSyntheticConstructs();
		mainObj.showDemo();
	}
}

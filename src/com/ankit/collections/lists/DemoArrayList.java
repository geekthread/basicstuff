package com.ankit.collections.lists;

import java.util.ArrayList;

public class DemoArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list50 = new ArrayList<String>(50);
		list.add("1");
		list50.add("2");
		System.out.println(list.size());
	}

}

package com.ankit.collections;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {
	public static void main(String[] args) {
		TreeMap<String,String> map = new TreeMap<String, String>();
		System.out.println("size:=>"+map.size());
		map.put(null, null);
		
		/*map.put("1", "One");
		System.out.println("size:=>"+map.size());
		map.put("2", "Two");*/
		System.out.println("size:=>"+map.size());
		System.out.println(map.getOrDefault("3", "233"));
	}

}

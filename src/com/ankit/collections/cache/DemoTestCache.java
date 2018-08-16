package com.ankit.collections.cache;

public class DemoTestCache {
	public static void main(String[] args) {
		DemoLruCache cache = new  DemoLruCache(0,10);
		Employee e = new Employee(1260, "Ankit Gupta", 11500000);
		Employee e1 = new Employee(1393, "Gaurav Gupta", 8800000);
		Employee e2 = new Employee(1410, "Sahil Mehra", 8000000);
		
		cache.addToCache(e);
		cache.addToCache(e1);
		cache.addToCache(e2);
		System.out.println(cache);
	}

}

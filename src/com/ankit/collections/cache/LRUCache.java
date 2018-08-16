package com.ankit.collections.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int cacheSize;

	public LRUCache(int cacheSize) {
		super(16, (float) 0.75, true);
		this.cacheSize = cacheSize;
	}

	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() >= cacheSize;
	}

	
	
	public static void main(String[] args) {
		LRUCache<Integer, Employee> cache = new LRUCache<Integer, Employee>(16);
		
		for (int i = 1; i <= 37; i++) {
			Employee e = new Employee(i, ("User" + i), i * 10000);
			cache.put(e.getId(), e);
			System.out.println("Cache Size:" + cache.size());
		}
	}

}
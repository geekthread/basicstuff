package com.ankit.collections.cache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DemoLruCache {
	private int size = 0;
	private int MAX_CAPACITY=10;
	/**
	 * id - key
	 * employee - value.
	 */
	private Map<Integer, Employee> cache = new HashMap<Integer,Employee>();
	private Map<Integer, Integer> accessHistoryCache= new HashMap<Integer,Integer>();
	
	@Override
	public String toString() {
		return "DemoLruCache [cache=" + cache + "]";
	}




	public DemoLruCache(int size, int mAX_CAPACITY) {
		super();
		this.size = size;
		MAX_CAPACITY = mAX_CAPACITY;
	}




	/**
	 * will return true if element added
	 * @param e
	 * @return
	 */
	public synchronized boolean addToCache(Employee e){
		boolean isAdded=false;
		if(size<MAX_CAPACITY){
			//Not present already
			if(cache.get(e)== null){
				cache.put(e.getId(), e);
				accessHistoryCache.put(e.getId(), 1);
				size++;	
				isAdded=true;
			}
			//if already present, update the last used time with 1
			else{
				Employee emp = cache.get(e.getId());
				Integer accessToken = accessHistoryCache.get(emp.getLruAccess());
						
				accessHistoryCache.put(e.getId(), accessToken+1);
				isAdded=false;
			}
		
		}
		/**
		 * now find out the Least used element.
		 */
		else{
			findElementForEviction();
			
		}
		return isAdded;
		
	}
	
	
	/**
	 * traverse element from the cache with min lru nand override
	 */
	
	private void findElementForEviction() {
		Iterator<Entry<Integer,Employee>>itr= cache.entrySet().iterator();
		while(itr.hasNext()){
			
		}
		
	}




	public Employee getFromCache(Employee e){
		return cache.get(e);
		
	}

}

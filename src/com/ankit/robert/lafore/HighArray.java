package com.ankit.robert.lafore;

import org.apache.log4j.Logger;

public class HighArray {
	private  long [] a ;
	private static final Logger logger = Logger.getLogger(HighArray.class);
	
	public HighArray(int size) {
		super();
		if(size>0)
		this.a = new long[size];
		else
			System.err.println("Please enter size of the array as a positive number");
	}
	
	/**
	 * add an element to the end of the array
	 * @param e
	 */
	public void insert(long e){
		a[a.length]=e;
	}
	
	/**
	 * find an element
	 * @param e
	 * @return
	 */
	public int find(long searchKey){
		logger.info("searchKey is :-" + searchKey);
		int foundIndex=-1;
		for(int index=0;index<a.length-1;index++){
			if(a[index]==searchKey){
				foundIndex=index;
				System.out.println("Found " + searchKey + " at index :-" + index);
				break;
			}
			if(index==a.length){
				System.err.println("Can't find number:-" + searchKey);
			}
		}
		
		
		
		return foundIndex;
		
	}
	
	/**
	 * remove an element
	 * @param e
	 * @return
	 */
	public boolean delete(long e){
		boolean isDeleted=false;
		int foundIndex=find(e);
		if(foundIndex>=0){
			//long [] newArr=cutDownArrAndCopyOver(foundIndex);
			a=cutDownArrAndCopyOver(foundIndex);
			
		}
		
		return isDeleted;
	}

	private long[] cutDownArrAndCopyOver(int foundIndex) {
		long newArr[] = new long[a.length-1];
		
		
		for(int index=0;index<foundIndex;index++){
			newArr[index] = a[index];
		}
		
		//move down the elements after foundIndex
		
		for(int index=foundIndex;index<a.length-1;index++){
			newArr[index]=a[index+1];
		}
		
		return newArr;
	}
	
	

}

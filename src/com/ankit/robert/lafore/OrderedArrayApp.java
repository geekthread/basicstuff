package com.ankit.robert.lafore;

import org.apache.log4j.BasicConfigurator;

public class OrderedArrayApp {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		OrderedArray orderArr = new OrderedArray(20);
		orderArr.insert(12);
//		orderArr.insert(-1);
		//orderArr.delete(13);
		//		orderArr.binarySearch(75);
		//orderArr.binarySearchBetter(75);
		orderArr.binarySearchBetter(1);
		orderArr.binarySearch(1);
		
	}

}

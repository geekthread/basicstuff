package com.ankit.robert.lafore.sorting;

public class ArrayBubApp {
	public static void main(String[] args) {
			
		long [] arr1 = {4,7,3,11,5,1,12,14,2,5};
		long [] arr = {30,29,28,27,26,25,24,23,22,21,20};
		
//		long [] arr = {4,7};
		ArrayBub unsortedArr = new ArrayBub(arr);
		ArrayBub unsortedArr1 = new ArrayBub(arr1);
		unsortedArr.bubbleSort(arr);
		unsortedArr1.bubbleSort(arr1);
	}
}

package com.ankit.robert.lafore.sorting;

public class ArraySelSortApp {
	public static void main(String[] args) {
		long [] arr = {30,29,28,27,26,25,24,23,22,21};
		long [] arr1 = {77, 99, 44, 55, 22, 88, 11, 0, 66, 33};
		ArraySelSort unsortedArr = new ArraySelSort(arr);
		ArraySelSort unsortedArr1 = new ArraySelSort(arr1);
		unsortedArr.selectionSort();
		unsortedArr1.selectionSort();
	}

}

package com.ankit.robert.lafore.sorting;

public class ArrayInsSortApp {
	public static void main(String[] args) {
		ArrayInsSort arr = new ArrayInsSort(10);
		arr.insert(77); // insert 10 items
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.display();
		arr.insertionSort();
		arr.display();
	}

}
package com.ankit.robert.lafore;

import java.util.Scanner;

public class DemoArrays {
	private static int[] arr = { 2, 3, 45, 6, 10, 41, 31, 51, 100, 22, 23, 12,
			8, 1, 4, 5, 7 };

	public void delete(int element) {
		int index = find(element);

		if (index >= 0) {
			System.out.println("Element " + element + " found at index:- "
					+ index);
			
			printArray(shiftElements(index));
		} else {
			System.err.println("Cant find element");
		}
	}

	private void printArray(int[] newArr) {
		System.out.println("Current Size:-" + newArr.length);
		for (int index = 0; index <= newArr.length - 1; index++) {
			System.out.print(newArr[index]);
			System.out.print(" ");

		}

	}

	/**
	 * copyover elements in the place of deleted elements.
	 * 
	 * @param index
	 * @return 
	 */
	private int[] shiftElements(int index) {
		int [] newArr = new int[arr.length-1];
		
		for(int i=0;i<index;i++){
			newArr[i]=arr[i];
		}
		
		System.out.println("Previous Size:-" + arr.length);
		for (int i = index; i <= arr.length - 1; i++) {
			if (i < arr.length - 1)
				newArr[i] = arr[i + 1];
			else {
				arr[i] = -1;
			}
		}
		return newArr;
	}

	public void add(int element) {

	}

	/**
	 * Searches the array with specified element. Complexity can O(n/2) if
	 * element is found in middle in worst case is O(2)
	 * 
	 * @param element
	 * @return
	 */
	public int find(int element) {
		int indexOfFoundElement = -1;
		for (int index = 0; index < arr.length - 1; index++) {
			if (element == arr[index]) {
				indexOfFoundElement = index;
				System.out.println("Found element" + element);
				break;
			}  
			else if (index == arr.length - 1) {
				System.err.println("Can't find:=" + element);
			}
			
		}

		return indexOfFoundElement;
	}

	public static void main(String[] args) {
		DemoArrays demoObj = new DemoArrays();
		System.out.println("Enter Item to delete");
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		System.out.println("Item to be deleted :-" + item);
		demoObj.delete(item);

	}

}

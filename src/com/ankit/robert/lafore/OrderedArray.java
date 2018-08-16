package com.ankit.robert.lafore;

import org.apache.log4j.Logger;

/**
 * Shows Binary Search and Linear Search Assumption array is sorted and contains
 * no dups.
 * 
 * @author ankit.gupta1
 *
 */
public class OrderedArray {
	private long[] a;
	private static final Logger logger = Logger.getLogger(OrderedArray.class);
	private int previousMiddleIndex = -1;
	private int count = 0;
	private int nElements = 0;
	private int foundIndex = -1;
	public OrderedArray(int size) {
		if (size >= 0) {
			this.a = new long[size];
			RandomFillArray(size, a);
		} else {
			System.err.println("Size  cant be negative.");
		}
	}

	public OrderedArray(long[] arr) {
		this.a = arr;
	}

	private void RandomFillArray(int size, long[] a2) {
		/*
		 * for(int i=0;i<size-5;i++){ a2[i] = (i+1); }
		 */
		for (int j = 0, i = 0; i < size ; i++) {
			if (i % 2 != 0) {
				a[j] = i;
				j++;
				nElements++;
			}

		}

		displayArr();

	}

	private void displayArr() {
		for (int i = 0; i < nElements; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	/**
	 * find an element -- Linear Search
	 * 
	 * @param e
	 * @return
	 */
	public int find(long searchKey) {
		logger.info("searchKey is :-" + searchKey);
		int foundIndex = -1;
		for (int index = 0; index < a.length - 1; index++) {
			if (a[index] == searchKey) {
				foundIndex = index;
				System.out.println("Found " + searchKey + " at index :-"
						+ index);
				break;
			}
			if (index == a.length) {
				System.err.println("Can't find number:-" + searchKey);
			}
		}

		return foundIndex;

	}

	/**
	 * finds an element using Binary Search. Assumption: Array is sorted.
	 * 
	 * @param searchKey
	 * @return
	 */
	public int binarySearch(long searchKey) {

		int index = this.binarySearch(searchKey, 0, a.length - 1);
		return index;
	}

	private int binarySearch(long searchKey, int startIndex, int endIndex) {
		long startTime = System.currentTimeMillis();
		
		int middleIndex = (startIndex + endIndex) / 2;
		if (previousMiddleIndex != middleIndex) {
			previousMiddleIndex = middleIndex;
			logger.info("suitable index:" + middleIndex);

			long elementAtMiddleIndex = a[middleIndex];
			if (searchKey == elementAtMiddleIndex) {
				foundIndex = middleIndex;
				logger.info("Element Found At index:-" + foundIndex);
				return foundIndex;
			} else if (elementAtMiddleIndex > searchKey) {
				logger.info("Too High, Looking in smaller range");
				binarySearch(searchKey, startIndex, middleIndex - 1);
			} else {
				logger.info("Too Low, Looking in Higher range");
				binarySearch(searchKey, middleIndex + 1, endIndex);
			}
		} else {
			logger.warn(searchKey + ":- Not Found! Exiting the program!");
			System.exit(-1);
		}
		logger.info("Count:-" + count);
		long endTime = System.currentTimeMillis();
		System.out.print("Total Time:-");
		System.out.println(endTime - startTime);
		return foundIndex;
	}

	public int binarySearchBetter(long searchKey) {
		long startTime = System.currentTimeMillis();
		int index = -1;
		int lowerBound = 0;
		int upperBound = a.length - 1;
		int jumpIn;
		while (true) {
			jumpIn = (lowerBound + upperBound) / 2;
			long element = a[jumpIn];
			if (element == searchKey) {
				logger.info("Found at index:-" + jumpIn);
				break;
			} else if (lowerBound > upperBound) {
				System.out.println("lowerbound:-" + lowerBound);
				System.out.println("upperbound:-" + upperBound);
				logger.warn("Can't Find element:-" + searchKey);
				System.exit(-1);
			} else {
				if (element > searchKey) { // Look in the lower half
					upperBound = jumpIn - 1;
				} else { // Look in the upper half
					lowerBound = jumpIn + 1;
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.print("Total Time:-");
		System.out.println(endTime - startTime);
		return index;
	}

	// Assumption :- Array is sorted.
	/**
	 * add an element to the array so that array remains sorted
	 * 
	 * @param e
	 */
	public void insert(long e) {
		// a[a.length]=e;
		int j = -1;
		// find the index for the element to be inserted.
		// Array being sorted. First element greater than the element to be
		// inserted will give us actual location to be inserted.
		for (int i = 0, max = a.length; i < max; i++) {
			if (a[i] > e) {
				j = i;
				break;
			}
		}

		// if element is found index will be greater than or equal to 0.
		// shift the elements in the upper zone to accommodate element.
		if (j >= 0) {
			moveElementsUp(j, e);
			logger.info("After Insertion:");
			displayArr();
		}

	}

	/**
	 * uses binary search to find the index location for the element to be
	 * inserted. Better than linear search because of time complexity. for 10
	 * elements - 4 search for 100 elements - 7 search for 1000 elements - 10
	 * search
	 * 
	 * @param e
	 */
	/*
	 * private int findIndex(long e) { int foundIndex=-1; int
	 * upperBound=a.length-1; int lowerBound =0; while(true){ int middleIndex =
	 * (lowerBound+upperBound)/2; long elementAtMiddleIndex = a[middleIndex];
	 * if(elementAtMiddleIndex==e){ foundIndex=middleIndex; } else
	 * if(lowerBound>upperBound){
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * }
	 */

	private void moveElementsUp(int j, long e) {
		if (j <= a.length - 1) {
			long currentElement = a[j];
			a[j] = e;
			moveElementsUp(j + 1, currentElement);
		}

	}

	/**
	 * remove an element
	 * 
	 * @param e
	 * @return
	 */
	public boolean delete(long e) {
		boolean isDeleted = false;
		//int foundIndex = find(e);
		int foundIndex = binarySearch(e);
		
		if (foundIndex >= 0) {
			a = cutDownArrAndCopyOver(foundIndex);

		}
		logger.info("After deletion");
		displayArr();
		return isDeleted;
	}

	private long[] cutDownArrAndCopyOver(int foundIndex) {
		nElements--;
		long newArr[] = new long[a.length - 1];

		for (int index = 0; index < foundIndex; index++) {
			newArr[index] = a[index];
		}

		// move down the elements after foundIndex

		for (int index = foundIndex; index < a.length - 1; index++) {
			newArr[index] = a[index + 1];
		}

		return newArr;
	}

}

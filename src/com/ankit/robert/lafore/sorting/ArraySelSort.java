package com.ankit.robert.lafore.sorting;

public class ArraySelSort {
	
	private long [] a;

	public ArraySelSort(long[] a) {
		super();
		this.a = a;
	}
	
	public void displayArr(){
		for(int i=0,max=a.length-1;i<=max;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("***********");
	}
	
	/*
	 * perform selection sort
	 * on an unordered array.
	 * *************
	 * Swaps - O(n)
	 * Comparisons - O(n^2)
	 * ***************
	 */
	public void selectionSort(){
		int min;
		int comparisons=0;
		int swaps=0;		
		int lowerBound=0;
		int upperBound=a.length-1;
		for(int index=lowerBound;index<upperBound;index++){ // compare the value at index with all other values in the array and store the minimum value.
		//	min = a[index];
			min=index;
			for(int i=index+1;i<=upperBound;i++){
				comparisons++;
				if(a[i]<a[min]){ // select this min value & check further.
					//min=a[i];
					min=i;
					
				}
			}
			
		
			swaps++;
			swapValues(index,min);      // Swap is done in the outer loop, so it's running N times. hence complexity is O(N) 
		}
		System.out.println("Swap value is :- "  + swaps);
		System.out.println("comparisons value is :- "  + comparisons);
		displayArr();
	}

	/**
	 * swaps the min value with the lowerbounded index
	 * @param index
	 * @param indexOfMinVal
	 */
	private void swapValues(int index, int indexOfMinVal) {
		long temp=a[index];
		a[index]=a[indexOfMinVal];
		a[indexOfMinVal]=temp;
		
	}
	
	
	
	

}

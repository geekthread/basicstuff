package com.ankit.robert.lafore.sorting;

/**
 * This class demonstrates bubble sort in progress.
 * @author ankit.gupta1
 *
 */
public class ArrayBub {
	
	private long [] a;

	public ArrayBub(int size) {
		super();
		this.a = new long [size] ;
	}

	/**
	 * takes an unsorted/partially sorted array as input 
	 * @param a
	 */
	public ArrayBub(long[] a) {
		super();
		this.a = a;
	}
	
	
	public void bubbleSort(){
		this.bubbleSort(a);
	}
	
	/**
	 * performs bubble sort on array.
	 */
	public void bubbleSort(long [] a){
		int upperBound=a.length-1;
		int lowerBound =0;
		int swaps=0;
		int iterations=0;
		while(upperBound>=lowerBound){
			for(int i=0,j=1;i<=upperBound && j<=upperBound; j++,i++){
				long lowerOrderElement = a[i];
				long upperOrderElement = a[j];
				iterations++;
				if(lowerOrderElement>upperOrderElement){ //swap positions
					a[i] = a[j];
					a[j]= lowerOrderElement;
					swaps=swaps+1;
				}
				else{  // sorted.
					continue;
				}
				
				
			}
			
			upperBound--;
//		System.out.println("upperBound:- " +upperBound);
//		System.out.println("lowerBound:- " +lowerBound);
		}displayArr(a);
		
		System.out.println("Total Swaps:- " + swaps);
		System.out.println("Total Iterations:- " + iterations);
	}

	private void displayArr(long[] a) {
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
	}
	
	
	

}

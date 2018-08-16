package com.ankit.collections.arrays;

public class MultiDimensionalArrays {
	public static void main(String[] args) {
		int ar1D[] = new  int[10] ;
		int[][] twoDArray = new int[4][3];
		int twoDArrayWithoutSecondArraySize[][]  = new int[40][];
		// Need to provide atleast first dimension
		// int [][]twoDArrayWithoutBothArraySize = new int [][];
		System.out.println(twoDArray.length);
		System.out.println(twoDArrayWithoutSecondArraySize.length);
		
		for (int r = 0; r < twoDArray.length; r++) {
			System.out.println(twoDArray[r].length);
			break;

		}

	processArray(ar1D);
	processArray(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17});
	}
	
	
	
	public static void processArray(int [] arr){
		System.out.println("Lenth of array is:-"+arr.length);
	}

}

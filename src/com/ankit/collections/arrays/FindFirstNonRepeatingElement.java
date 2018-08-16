package com.ankit.collections.arrays;

public class FindFirstNonRepeatingElement {
	
	public static void main(String[] args) {
	FindFirstNonRepeatingElement obj = new FindFirstNonRepeatingElement();
	int [] arr = {2,2,4,5,2,6,3};
	obj.findFirstNonRepeat(arr);
	}

	private void findFirstNonRepeat(int[] arr) {
		for(int index=1; index<arr.length-1;){
			//compareWithPrevious(arr,index,arr[index]);
			int element = arr[index];
			//loop
			if(arr[index-1]==element){
				System.out.println("First Non Repeating element found at index:->" + index);
			
			
		}
		
	}

	/*private void compareWithPrevious(int[] arr, int i, int element) {
		//for(int index=0; index<=i;index++){
			if(arr[index]==element){
				System.out.println("First Non Repeating element found at index:->" + index);
				break;
			//}
		}
		
	}*/
	}
}
	

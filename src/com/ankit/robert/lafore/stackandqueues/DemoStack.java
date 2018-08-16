package com.ankit.robert.lafore.stackandqueues;

import javax.naming.OperationNotSupportedException;

public class DemoStack {

	private long[] stackArray;
	private int nElements=0;
	
	public DemoStack(int size) {
		this.stackArray = new long[size];
	}

	/**
	 * push the item on top of stack
	 * 
	 * @param item
	 * @throws OperationNotSupportedException 
	 */
	public void push(long item) throws OperationNotSupportedException {
	if(nElements<stackArray.length){
		this.stackArray[nElements] = item;
		nElements++;
	}
	else{
		throw new OperationNotSupportedException();
	}
	}

	/**
	 * pops up the top of stack
	 * 
	 * @return
	 * @throws OperationNotSupportedException 
	 */
	public long pop() throws OperationNotSupportedException {
		
		if(nElements>0){
		nElements--;
		}
		else{
			throw new OperationNotSupportedException();
		}
		System.out.println(stackArray[nElements]);
		return stackArray[nElements];
	}

	/**
	 * peek the top of stack without removing the element
	 * 
	 * @return
	 */
	public void peek() {
		System.out.println(stackArray[nElements-1]);
	}

	public void display() {
		
		for(int i=nElements-1;i>=0;i--){
			System.out.println(stackArray[i]);
		}
	}
}

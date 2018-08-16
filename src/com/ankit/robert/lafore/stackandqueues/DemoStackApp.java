package com.ankit.robert.lafore.stackandqueues;

import javax.naming.OperationNotSupportedException;

public class DemoStackApp {
	public static void main(String[] args) throws OperationNotSupportedException {
		DemoStack obj  = new DemoStack(10);
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.push(60);
		obj.push(70);
		obj.push(80);
		obj.push(90);
		obj.push(100);
//		obj.push(110);
		
		obj.display();

		//obj.peek();
		
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		System.out.println("****************");
		//obj.peek();
	}

}

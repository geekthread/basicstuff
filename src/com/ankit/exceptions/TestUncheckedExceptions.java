package com.ankit.exceptions;

public class TestUncheckedExceptions {

	public void method1() throws Exception{
		System.out.println("inside method1");
		//throw new UnCheckedException("Unchecked Exception");
		throw new Exception(new UnCheckedException("HH"));
	}
	
	public void method2(){
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

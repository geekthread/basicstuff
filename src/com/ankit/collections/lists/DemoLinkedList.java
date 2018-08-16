package com.ankit.collections.lists;

import java.util.LinkedList;

public class DemoLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("A");
		ll.add("K");
		ll.add("I");
		ll.add("T");
		ll.add(1, "N");
		
		ll.add("G");
		
		ll.add("P");
		ll.add("T");
		ll.add("A");
		ll.add(6,"U");
	
		
		System.out.println(ll.size());
		
		
		for(int i=0; i< ll.size();i++){
			if(ll!=null){
				System.out.println(ll);	
			}
			/*else{
				System.out.println("Hello");
			}*/
			
		}
		
	}

}

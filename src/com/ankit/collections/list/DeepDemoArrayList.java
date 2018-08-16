package com.ankit.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DeepDemoArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		/* int i=0;
		while(true){ System.out.println("i:=="+i++); list.add(i++); }*/
		 

		for (int j = 0; j < 10; j++) {
			list.add(j);
		}
		
		ListIterator<Integer> listItr = list.listIterator(5);
		
		System.out.println(listItr.hasPrevious());

	}

}

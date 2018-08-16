package com.ankit.collections;

import java.util.Collection;
import java.util.HashSet;

public class DemoCollectionInterface {
	public static void main(String[] args) {
		String anElement  = "Hello";
		String anotherElement = new String("Hello");
		
		System.out.println(anElement.hashCode() == anotherElement.hashCode());
		System.out.println(anElement.equals(anotherElement));
		
		Collection collection = new HashSet<String>();
		boolean wasElementAdded  = collection.add(anElement);
		System.out.println(wasElementAdded);
		boolean wasAnotherElementAdded  = collection.add(anotherElement);
		System.out.println(wasAnotherElementAdded);
		boolean wasRemoved = collection.remove(anElement);
		System.out.println(wasRemoved);
	}

}

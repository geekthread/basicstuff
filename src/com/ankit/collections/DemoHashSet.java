package com.ankit.collections;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSet {
//	private static final String VALUE = "EMPTY";
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ankit Gupta", "STC", new BigDecimal(1150000), "Noida");
		Employee e2 = new Employee(1, "Ankit Gupta", "STC", new BigDecimal(950000), "Noida");
		Employee e3 = new Employee(3, "Gaurav Gupta", "TC", new BigDecimal(880000), "Noida");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		System.out.println(e1.equals(e2));
		
		Set<Employee> setOfEmployees  = new HashSet<Employee>();
		setOfEmployees.add(e1);
		setOfEmployees.add(e2);
		setOfEmployees.add(e3);
		System.out.println("Size of Employee Set:- " + setOfEmployees.size());
		
		//All the entries in the set
		
		Iterator<Employee> itr = setOfEmployees.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}

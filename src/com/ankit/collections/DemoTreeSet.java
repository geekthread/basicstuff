package com.ankit.collections;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class DemoTreeSet {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ankit Gupta1", "STC", new BigDecimal(1150000), "Noida");
		Employee e2 = new Employee(2, "Ankit Gupta", "TC", new BigDecimal(950000), "Noida");
		Employee e3 = new Employee(3, "Gaurav Gupta", "TC", new BigDecimal(880000), "Noida");
		
		Set<Employee> treeSet = new TreeSet<Employee>();
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		
		System.out.println(treeSet.size());
		
		//Iterate elements of a TreeSet 
		/*Iterator<Employee> itr  = treeSet.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		SalaryComparator sal = new  SalaryComparator();
		Set<Employee> treeSetComparator = new TreeSet<Employee>(sal);
		treeSetComparator.add(e1);
		treeSetComparator.add(e2);
		treeSetComparator.add(e3);
		
		
		
		Iterator<Employee> itrComparator  = treeSetComparator.iterator();
		
		while(itrComparator.hasNext()){
			System.out.println(itrComparator.next());
		}
		
		
	}

}

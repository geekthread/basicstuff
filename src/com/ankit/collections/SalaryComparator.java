package com.ankit.collections;

import java.util.Comparator;

public  class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int salEmp1 = o1.getSalary().intValue();
		int salEmp2 = o2.getSalary().intValue();
		System.out.println("Employee:->"+ o1.getName()+"->"+salEmp1 );
		System.out.println("Employee:->"+ o2.getName()+"->"+salEmp2 );
		return salEmp1-salEmp2;
	}
	
}
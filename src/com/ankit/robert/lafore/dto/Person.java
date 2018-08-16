package com.ankit.robert.lafore.dto;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	
	
	public Person() {
		super();
	}

	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void displayPerson(){
		System.out.println("lastName " + this.lastName);
		System.out.println("firstName " + this.firstName);
		System.out.println("age " + this.age);
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String getFirstName(){
		return this.firstName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}

	/**
	 * Check for person's equality by comparing it's fields.
	 */
	@Override
	public boolean equals(Object person) {
		Person p = (Person) person;
		if(this.getFirstName().equals(p.getFirstName())){
			if(this.getLastName().equals(p.getLastName()) && this.getAge()==p.getAge()){
				return true;
			}
		}
		
		return false;
		
		
	}
	
	
	
	
	
	

	
	
}

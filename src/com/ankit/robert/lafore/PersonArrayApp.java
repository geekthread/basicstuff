package com.ankit.robert.lafore;

import com.ankit.robert.lafore.dto.Person;

public class PersonArrayApp {
	private Person [] personArr;
	private int nElements;
	
	public PersonArrayApp(int size) {
		super();
		this.personArr= new Person[size];
		nElements=0;
	}
	
	/**
	 * inserts the new person into the array.
	 * @param p
	 */
	public void insert(Person p){
		personArr[nElements] = p;
		nElements++;
	}
	
	public Person find(Person searchPerson){
		for(int index=0,max=personArr.length-1; index<max;index++){
			if(personArr[index].equals(searchPerson)){
				
				
				break;
			}
		}
		
		return searchPerson;
		
	}
	
	/*public Person binarySearch(Person searchPerson){
		return searchPerson;
		
	}*/
	
	public boolean delete(Person personToBeDeleted){
		return false;
		
	}
	
	
}

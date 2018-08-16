package com.ankit.collections.arrays;

import java.io.Serializable;

public final class MyImmutableObject implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();

	}


	private final String name;
	private final MyReferenceVariable ref;
	
	
	public MyImmutableObject(String name, MyReferenceVariable ref) {
		super();
		this.name = name;
		this.ref = ref;
	}


	public String getName() {
		return name;
	}


	public MyReferenceVariable getRef() {
		return ref;
	}
	
	
	
	
	

}

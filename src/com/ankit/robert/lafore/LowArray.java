package com.ankit.robert.lafore;

public class LowArray {
	private long[] a;

	public LowArray(int size) {
		this.a = new long[size];
	}

	public void setElem(int index, long value) // set value
	{
		a[index] = value;
	}

	public long getElem(int index) // get value
	{
		return a[index];
	}

}

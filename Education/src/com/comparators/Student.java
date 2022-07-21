package com.comparators;

public class Student {
	/* This class, and others in this package, will be used to illustrate comparators.
	 * Also, the general usage of this type of object as it might pertain to real world
	 * applications.
	 */
	int rollno; //Roll number
	String name, address;
	
	//A student can not be instantiated without the properties.
	public Student(int rollno, String name, String address) {
		// This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
	}    
	
	//Typical helper method.
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address ;
	}
}

package com.comparators;

import java.util.Comparator;

//Class 2
//Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student> {

 // Method
 // Sorting in ascending order of roll number
 public int compare(Student a, Student b)
 {
	 //Note: The actual value return only matters in that:
	 //if > 0, a comes AFTER b
	 //if = 0, a and b are equal
	 //if < 0, b comes after a.
	 //The logic which utilizes the compare function handles this.
	 //(TimSort.class in java.util)
     return a.rollno - b.rollno;
 }
}
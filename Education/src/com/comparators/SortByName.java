package com.comparators;

import java.util.Comparator;

class Sortbyname implements Comparator<Student> {

 // Method
 // Sorting in ascending order of name
 public int compare(Student a, Student b)
 {
     return a.name.compareTo(b.name);
 }
}
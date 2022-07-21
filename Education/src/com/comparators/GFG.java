package com.comparators;

import java.util.ArrayList;
import java.util.Collections;

//Class 4
//Main class
//From geeks for geeks @ https://www.geeksforgeeks.org/comparator-interface-java/
class GFG {

 // Main driver method
 public static void main(String[] args)
 {

     // Creating an empty ArrayList of Student type
     ArrayList<Student> ar = new ArrayList<Student>();

     // Adding entries in above List
     // using add() method
     ar.add(new Student(111, "Larry", "Phoenix"));
     ar.add(new Student(131, "Tony", "NYC"));
     ar.add(new Student(121, "Dave", "Lexington"));
     ar.add(new Student(101, "Tom", "Wellsville"));
     ar.add(new Student(999, "Tommy", "Los Angeles"));
     // Display message on console for better readability
     System.out.println("Unsorted");

     // Iterating over entries to print them
     for (int i = 0; i < ar.size(); i++)
         System.out.println(ar.get(i));

     // Sorting student entries by roll number
     Collections.sort(ar, new Sortbyroll());

     // Display message on console for better readability
     System.out.println("\nSorted by rollno");

     // Again iterating over entries to print them
     for (int i = 0; i < ar.size(); i++)
         System.out.println(ar.get(i));

     //Interesting....binarySearch on Collections class gave this error:
     //	- The method binarySearch(List<? extends Comparable<? super T>>, T) in the type Collections is not applicable 
	 //   for the arguments (ArrayList<Student>, SearchByRollNumber)
     // 121 should be at index 2, which is middle of 5 long array.
     SearchByRollNumber ob = new SearchByRollNumber();
     int searchResult = ob.binarySearchByRoll(ar, 0, ar.size(), 101);
     System.out.println("Recursive BinarySearch results for 101 = " + searchResult);
    
     searchResult = ob.binarySearchByRoll(ar, 0, ar.size(), 121);
     System.out.println("Recursive BinarySearch results for 121 = " + searchResult);
     
     searchResult = ob.binarySearchByRoll(ar, 0, ar.size(), 999);
     System.out.println("Recursive BinarySearch results for 999 = " + searchResult);
     
     searchResult = ob.binarySearchByRoll(ar, 0, ar.size(), 222);
     System.out.println("Recursive BinarySearch results for 222 = " + searchResult);
     
     //For fun, I implemented the iterative search too...
     searchResult = ob.binarySearchByRoll(ar, 0, ar.size(), 101);
     System.out.println("Recursive BinarySearch results for 101 = " + searchResult);
     
     searchResult = ob.iterativeSearchByRoll(ar, 121, 0, ar.size() );
     System.out.println("Iterative BinarySearch results for 121 = " + searchResult);
     
     searchResult = ob.iterativeSearchByRoll(ar, 999, 0, ar.size() );
     System.out.println("Iterative BinarySearch results for 999 = " + searchResult);
     
     searchResult = ob.iterativeSearchByRoll(ar, 222, 0, ar.size() );
     System.out.println("Iterative BinarySearch results for 222 = " + searchResult);
     
     
     SearchByName sbName = new SearchByName();
     // Sorting student entries by name
     Collections.sort(ar, new Sortbyname());

     // Display message on console for better readability
     System.out.println("\nSorted by name");

     // // Again iterating over entries to print them
     for (int i = 0; i < ar.size(); i++)
         System.out.println(ar.get(i));
    
     //When sorted by name: Dave, Larry, Tom, Tommy, Tony
     searchResult = sbName.binarySearchByName(ar, 0, ar.size(), "Tommy"); //3
     System.out.println("Iterative BinarySearch results for Tony = " + searchResult);

     searchResult = sbName.binarySearchByName(ar, 0, ar.size(), "Dave"); //0
     System.out.println("Iterative BinarySearch results for Dave = " + searchResult);
     
     searchResult = sbName.binarySearchByName(ar, 0, ar.size(), "Tom"); //2
     System.out.println("Iterative BinarySearch results for Tom = " + searchResult);
     
     searchResult = sbName.binarySearchByName(ar, 0, ar.size(), "Tony"); //4
     System.out.println("Iterative BinarySearch results for Tony = " + searchResult);
     
     searchResult = sbName.binarySearchByName(ar, 0, ar.size(), "Larry"); //1
     System.out.println("Iterative BinarySearch results for Larry = " + searchResult);
     
     
     searchResult = sbName.binarySearchByName(ar, 0, ar.size(), "Phil"); //-1
     System.out.println("Iterative BinarySearch results for Phil = " + searchResult);
     
     
     
 }
}
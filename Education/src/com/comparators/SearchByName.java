package com.comparators;

import java.util.ArrayList;

public class SearchByName {
	//l = start at
	//r = end search or length ( end must be <= length!)
	//x = search term.
	//Returns index of x if it is present in arr[]
    //return -1 if not found
	public int binarySearchByName(ArrayList<Student> arr, int l, int r, String x)
    {
		if (r >= l) {
            int mid = l + (r - l) / 2;
  
            // If the element is present at the
            // middle itself
            if (arr.get(mid).name.compareTo(x) == 0)
                return mid;
  
            //When comparing strings:
            //the value 0 if the argument string is equal to this string; 
            //a value less than 0 if this string is lexicographically less than the string argument; 
            //and a value greater than 0 if this string islexicographically greater than the string argument.
            //if (x.compareToIgnoreCase(arr.get(mid).name) < 0)
            if (arr.get(mid).name.compareToIgnoreCase(x) > 0)
                return binarySearchByName(arr, l, mid - 1, x);
  
            // Else the element can only be present
            // in right subarray
            return binarySearchByName(arr, mid + 1, r, x);
        }
  
        // We reach here when element is not present
        // in array
        return -1;
    }
    										
    public int iterativeSearchByName(ArrayList<Student> arr, int x, int low, int high) {
    	//repeat till low = high
    	while (low < high) {
    		int mid = (low + high)/2;
    		if (x == arr.get(mid).rollno) {    			
    			return mid;
    			//low = high;//To force break
    		} else if (x > arr.get(mid).rollno) // x is on the right side
                 low = mid + 1;
    		else                  // x is on the left side
    			high = mid - 1;
    	}
    	return -1;
    }
}

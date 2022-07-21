package com.comparators;

import java.util.ArrayList;

public class SearchByRollNumber {
	//l = start at
	//r = end search or length ( end must be <= length!)
	//x = search term.
	//Returns index of x if it is present in arr[]
    //return -1 if not found
	public int binarySearchByRoll(ArrayList<Student> arr, int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            // If the element is present at the
            // middle itself
            if (arr.get(mid).rollno == x)
                return mid;
  
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr.get(mid).rollno > x)
                return binarySearchByRoll(arr, l, mid - 1, x);
  
            // Else the element can only be present
            // in right subarray
            return binarySearchByRoll(arr, mid + 1, r, x);
        }
  
        // We reach here when element is not present
        // in array
        return -1;
    }
    										
    public int iterativeSearchByRoll(ArrayList<Student> arr, int x, int low, int high) {
    	//repeat till low = high
    	while (low < high) {
    		int mid = (low + high)/2;
    		if (x == arr.get(mid).rollno) {    			
    			return mid;
    		} else if (x > arr.get(mid).rollno) // x is on the right side
                 low = mid + 1;
    		else                                // x is on the left side
    			high = mid - 1;
    	}
    	return -1;
    }
}    

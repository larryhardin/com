package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLeets {
	public int[] twoSum(int[] nums, int target) {
        int[] retArray = {-1,-1};;
        for ( int i = 0; i<nums.length;i++) {
        	int rVal = addNumComp(nums, (i+1), nums.length, nums[i], target);
        	if (rVal > -1 ) {
        			retArray[0] = i;
        			retArray[1] = rVal;
        	}
        }
        return retArray;
    }
	
	private int addNumComp(int[] nums, int start, int stop, int lVal, int target){
        while (start < stop) {
            if ( nums[start] + lVal == target) {
                return start;
            } else {
            	start++;
            }
        }
        return -1;
    }

	public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
		var mix = new int[2];
		mix[0] = tomatoSlices;
		mix[1] = cheeseSlices;
		
		List<Integer> lDistr = getDistribution(mix);
		return lDistr;
	}
	
	public List<Integer> getDistribution(int[] tomatoCheese) {
		//If able to use all, then return number of jumbo and small.
		//Number of jumbo or small can be zero.
		//if not, return empty list.
		Integer[] distr = {0,0};
		int[] jumboBurger = {4,1};
		int[] smallBurger = {2,1};
		int maxNumber=0;
		//What is theoretical maximum number of either that can be made?
		if ( tomatoCheese[1] % Math.max(jumboBurger[1], smallBurger[1]) == 0 ) {
			maxNumber = tomatoCheese[1] / jumboBurger[1];
		}
		
		//Goal, making a combination of one or more types of burger, use all ingredients.
		//Note, as both types use only one slice of cheese, that will become the MAXIMUM of either burger.
		for ( int i=1;i<=maxNumber;i++) {			
			//can a small burger be made?
			if ( tomatoCheese[0] - smallBurger[0] >= 0 && tomatoCheese[1] - smallBurger[1] >= 0 ) {
				distr[1] = distr[1] + 1;
				tomatoCheese[0] = tomatoCheese[0] - smallBurger[0]; //consume tomatos
				tomatoCheese[1] = tomatoCheese[1] - smallBurger[1]; //consume cheese
			}			
		}
		if ( tomatoCheese[0] > 0 || tomatoCheese[1] > 0)
			return Collections.emptyList();
		return Arrays.asList(distr);
	}
}

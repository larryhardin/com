import java.util.Arrays;
import java.util.List;

import com.leetcode.ArrayLeets;
public class LeetSolutions {

	public static void main(String[] args) {
		//leet1DoSum();
		leet1276NumberOfBurgers();
	}

	private static void leet1DoSum() {
		var arrayLeet   = new ArrayLeets();
		var resultArray = new int[2]; 
		var intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 2;
		intArray[2] = 4;
		resultArray = arrayLeet.twoSum(intArray, 7);
		for (int i=0;i<resultArray.length;i++)
			System.out.println(resultArray[i]);
		
		var ex2Array = new int[4];
		ex2Array[0] = 2;
		ex2Array[1] = 7;
		ex2Array[2] = 11;
		ex2Array[3] = 15;
		resultArray = arrayLeet.twoSum(ex2Array, 26);
		for (int i=0;i<resultArray.length;i++)
			System.out.println(resultArray[i]);
		
		var ex3Array = new int[2];
		ex3Array[0] = 3;
		ex3Array[1] = 3;
		resultArray = arrayLeet.twoSum(ex3Array, 6);
		for (int i=0;i<resultArray.length;i++)
			System.out.println(resultArray[i]);

	}

	private static void leet1276NumberOfBurgers() {
		var arrayLeet   = new ArrayLeets();		
		int[] tomatoCheese = {16,8};
		List<Integer> lDistr = arrayLeet.getDistribution(tomatoCheese);
		System.out.println(lDistr.toString()); //Expect 0,8
		
		tomatoCheese[0] = 16;
		tomatoCheese[1] = 4;
		lDistr = arrayLeet.getDistribution(tomatoCheese);
		System.out.println(lDistr.toString()); //Expect 4,0
		
	}

}

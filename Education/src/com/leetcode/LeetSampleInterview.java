package com.leetcode;

public class LeetSampleInterview {

	public static void main(String[] args) {		
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		var banned    = new String[1];
		var word      = new String();		
		
		var solution = new MostUsedWord();
		banned[0] =  "hit";
		word = solution.solution(paragraph, banned);
		System.out.println(word);
		
		paragraph = "a.";
		banned = new String[0];
		word = solution.solution(paragraph, banned);
		System.out.println(word);
		
		paragraph = "Bob!";
		banned = new String[0];
		word = solution.solution(paragraph, banned);
		System.out.println(word);
		
		paragraph = "Bob. hIt, baLl";
		banned = new String[]{"bob", "hit"};
		word = solution.solution(paragraph, banned);
		System.out.println(word);
		
		paragraph = "a, a, a, a, b,b,b,c, c";
		banned = new String[]{"a"};
		word = solution.solution(paragraph, banned);
		System.out.println(word);

		var solution2 = new MostUsedWordsWithHashMap();
		paragraph = "b,b,b,b,b,a,a, a, a, a, c, c";
		banned[0] =  "ac";
		word = solution2.solution(paragraph, banned);
		System.out.println(word);
		

	}	
}

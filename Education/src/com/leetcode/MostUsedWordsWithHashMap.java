package com.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostUsedWordsWithHashMap {

	public String solution(String paragraph, String[] banned) {
		//converts non aplhanumeric and space to space AND converts to lower case
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        //splits into words on one or more spaces
        String[] words = paragraph.split("\\s+");

        //Set     = unique collection. Basically creates an 
        //          unordered unique list of banned words.
        //HashSet = implements set, so not sure why Set is used in first.
        // With Set or HashSet as first, both warnings are displayed:
        //  HashSet is a raw type. References to generic type HashSet<E> should be parameterized         
        //	Type safety: The expression of type HashSet needs unchecked conversion to 
   	 	//               conform to HashSet<String>
        //Solved warning by adding <> to HashSet<>()...is conclusion that the casting
        //operator <> provided an unchecked conversion because no type was specified?
        //If I add String between <>, <String>, does this create implicit conversion? 
        //Note: Code still worked.
        Set<String> bannedWords = new HashSet<>();
        for (String word : banned)
            bannedWords.add(word);

        //Key value pairs without duplicates where key is string and value is integer
        //stored in hash map. Note, no warning as with Set/HashSet
        Map<String, Integer> wordCount = new HashMap<>();
        
        //Add non-banned words to the wordCount HashMap, if it is there already,
        //increase count by 1. If it is not there, add it with a 1 by automatically
        //incrementing specified default value of zero. This is the only way the 
        //code can work in a single in-line statement, otherwise would have to surround
        //in conditional logic.
        for (String word : words) {
            if (!bannedWords.contains(word))
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
                
        // 4). return the word with the highest frequency by providing the entire Set
        //     I do not understand how it knows what value to compare, unless it
        //     relies upon the structure defined as key/value pairs...which
        //     seems to make sense in that the pair is return and then the key
        //     is extracted with the .getKey() method
        return Collections.max(wordCount.entrySet(), 
        		               Map.Entry.comparingByValue()
        		               ).getKey();
    }
}

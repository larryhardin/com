package com.leetcode;

public class MostUsedWord {
	private class WordAndCount {
		public String word = new String();
		public int    count = 0;	
	}
	public String solution(String paragraph, String[] banned) {
        var mostCommon = new String();
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        
        String[] words = paragraph.split("\\s+");
        WordAndCount[] wc = new WordAndCount[words.length];
        //instantiate for each word, unless it is banned.
        for ( int i = 0;i<words.length;i++){
        	if (!isBanned(banned, words[i]) && words[i] != "" )
        		if ( wc[i] == null ) {
        			wc[i]       = new WordAndCount();
        			wc[i].word  = words[i];
        			wc[i].count = 0;
        		}
        }
        
        int max = 0;
        for ( int i = 0;i<words.length;i++){
        	//is it in the array already?
        	String word =  words[i];
        	for ( int j =0;j<wc.length;j++) {
        		if (wc[j] != null )
        		if ( wc[j].word.compareToIgnoreCase(word) == 0) {        	
        			wc[j].count++;
        			if ( max < wc[j].count )
        				max = wc[j].count;
        			break;
        		} 
        	}
        } 	
        for ( int i = 0; i < wc.length;i++) {
        	if ( wc[i] != null && wc[i].count == max ) {
        		mostCommon = wc[i].word;
        		break;
        	}
        }	
        return mostCommon.toLowerCase();
	}
	
	private boolean isBanned(String[] banned, String value) {
		Boolean isBanned = false;
		//If no words are banned, no need to check.
		if (banned.length == 0 )
			return false;
		
		for ( int i=0;i<banned.length;i++)
			if ( banned[i].compareToIgnoreCase(value) == 0 )
				isBanned = true;
		return isBanned;
	}
}

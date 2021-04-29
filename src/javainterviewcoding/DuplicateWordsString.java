package javainterviewcoding;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsString {

	
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDuplicatewords("Hey java is java best language is java ");

	}

	
	public static void findDuplicatewords(String input) {
		
		
		//split
		
		String[] words = input.split("");
		
		//create hashmap
		
		HashMap<String,Integer> wordcount = new HashMap<String,Integer>();
		
		//to check each word in given array
		
		for(String word:words) {
			
			//if word is present
			
			if(wordcount.containsKey(word)) { 
				
				
				wordcount.put(word.toLowerCase(),wordcount.get(word)+1);
				
				
			}
			
			else {
				
				wordcount.put(word, 1);
			}
		}
		
		//extracting the all keys of map-wordcount

		Set<String>  wordsInString =wordcount.keySet();
		
		
		//loop through all the words in word count
		
		
		for(String word:wordsInString) {
			
			if(wordcount.get(word)>1) {
				
				System.out.println(word+":"+wordcount.get(word));
			}
			
		}
		
		
		
	}
	
}

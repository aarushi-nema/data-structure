package string;

import java.util.HashMap;

import java.util.Set;

public class Program010duplicate_word_in_string {
	
	public static void duplicate_words (String str){
		String words[]= str.split(" ");
		
		HashMap<String , Integer> list_of_words= new HashMap<String, Integer>();
		
		for(String word: words){
			
			if(list_of_words.containsKey(word.toLowerCase())){
				
				list_of_words.put(word.toLowerCase(), list_of_words.get(word.toLowerCase())+1);
			}
			
			else{
				
				list_of_words.put(word.toLowerCase(), 1);
			}
			
		}
		
		Set<String> unique_words= list_of_words.keySet();
		
		for(String word : unique_words){
			if(list_of_words.get(word)>1 ){
				System.out.println(word+ ":" + list_of_words.get(word));
			}
		}
		
	}
	
	public static void main (String [] args){
		duplicate_words("coding yesterday coding today coding always");
	}

}

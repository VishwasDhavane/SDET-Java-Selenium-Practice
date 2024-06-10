package javapractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Practice_7 {

	public static void main(String[] args) {
		// Write a Java program to find duplicate characters in a string
		
		String str="Better Butter";
		 char ch[]=str.toCharArray();
		 HashMap<Character,Integer> word= new HashMap<Character,Integer>();
		 
		 for(Character d :ch) {
			 
			 if(word.containsKey(d))
			 {
				 word.put(d, word.get(d)+ 1);
			 }
			 else
			 {
				 word.put(d, 1);
			 }
		 }
		 
		
		
		Set<Character> words =word.keySet();
		
		for(Character bn : words)
		{
			if(word.get(bn)> 1)
			{
				System.out.println(bn + " : " +word.get(bn));
			}
		}
	
		 

	}

}

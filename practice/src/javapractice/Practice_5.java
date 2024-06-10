package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice_5 {
	
	//Write a Java program to count the number of occurrences of each character in a string?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is sparta";
		HashMap<Character,Integer> wordcount = new HashMap<Character,Integer>();
		String word[]=str.split(" ");
		//inputString.replaceAll("\\s+", "")
		char ch[] =str.toCharArray();
		
		for(Character words : ch)
		{
			if(wordcount.containsKey(words))
			{
				wordcount.put(words,wordcount.get(words)+1);
			}
			else
			{
				wordcount.put(words, 1);
			}
		}
		
		
		Set<Entry<Character,Integer>> display= wordcount.entrySet();
		
		for(Entry<Character, Integer> g : display)
		{
			System.out.println(g.getKey()+ " : " + g.getValue());
		}

	}

}

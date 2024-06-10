package javapractice;

import java.util.LinkedHashMap;

public class Practice_15 {

	public static void main(String[] args) {
		// How do you find longest substring without repeating characters in the given string?
		
		
		String str="javaconceptoftheday";
		char[] ch =str.toCharArray();
		String sub="";
		int len=0;
		
		LinkedHashMap<Character,Integer> charmap= new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<ch.length;i++)
			
		{
			char cb=ch[i];
			
			if(!charmap.containsKey(cb))
			{
				charmap.put(cb, i);
			}
			
			
			else
			{
				i=charmap.get(cb);
				charmap.clear();
			}
			
			if(charmap.size()>len)
			{
				len=charmap.size();
				sub=charmap.keySet().toString();
			}
		}
		
		System.out.println("the longest STring is : "+sub);
		
		

	}

}

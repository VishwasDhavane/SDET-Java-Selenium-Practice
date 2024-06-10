package javapractice;

import java.util.LinkedHashMap;

public class Practice_18 {

	public static void main(String[] args) {
		//How do you find first repeated and non-repeated character in the given string in Java
		
		String str="JavaConceptOfTheDay";
		char[] ch =str.toCharArray();
		
		LinkedHashMap<Character,Integer> charmap= new LinkedHashMap<Character,Integer>();
		
		
		for(char cd : ch)
		{
			
			if(charmap.containsKey(cd))
			{
				charmap.put(cd, charmap.get(cd)+ 1);
			}
			else
			{
				charmap.put(cd, 1);
			}
			
			
		}
			
			
			for(char cd : ch)
			{
				if(charmap.get(cd)==1)
				{
					System.out.println("NOn repated value : "+cd+ " ' ");
					break;
				}
			}
			
			for(char cd : ch)
			{
				if(charmap.get(cd)>1)
				{
					System.out.println(" repated value : "+cd+ " ' ");
					break;
				}
			}
			
		}
	

}

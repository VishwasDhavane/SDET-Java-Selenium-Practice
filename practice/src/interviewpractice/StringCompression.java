package interviewpractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "aaabbcc";
		//a3b2c2
		
	   char[] ch =	a.toCharArray();
	   
	   HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	   
	   for(Character c : ch)
	   {
		   if(map.containsKey(c))
		   {
			   map.put(c,map.get(c)+1);
		   }
		   else
		   {
			   map.put(c, 1);
		   }
	   }
	   
	             Set<Entry<Character,Integer>>   d= map.entrySet();
	             
	             for(Entry<Character,Integer> f : d)
	             {
	            	 System.out.println(f.getKey()+"   "+f.getValue());
	            	 
	             }
	             
	             
	             
	             for(char cd : map.keySet())
	             {
	            	 System.out.print(cd);
	            	 System.out.print(map.get(cd));
	             }
	             
	            
	   
	 

	}

}

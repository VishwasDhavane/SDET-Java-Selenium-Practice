package arraypractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How do you find the most frequent element in an array?
		
		int[] arr = new int[] {1,3,4,5,5,6,7};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
		
		for(int i : arr)
		{
			
		if(map.containsKey(i))
		{
			map.put(i,map.get(i)+1);
		}
		else
		{
			map.put(i,1);
		}
		
		}
		
		  int element=0;
		  int frequency=1;
		  
		         Set<Entry<Integer,Integer>> sete= map.entrySet();
		         
		         for(Entry<Integer,Integer> entry : sete)
		         {
		        	 if(entry.getValue()>frequency)
		        	 {
		        		 frequency=entry.getValue();
		        		 element=entry.getKey();
		        	 }
		         }
		
		if(frequency>1)
			
		{
			System.out.println("the most frequent element"+element);
			System.out.println(frequency);
		}
		else
		{
			System.out.println("all are unique");
		}
		
		

	}

}

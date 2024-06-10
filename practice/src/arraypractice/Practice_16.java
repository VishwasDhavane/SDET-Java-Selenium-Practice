package arraypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Practice_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to sort array elements by frequency in Java?
		
		int[] arr= new int[] {2,4,5,5,5,6,4,4,4,2,1,1,1,1};
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		             ArrayList<Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
		             
		             Collections.sort(list,(o1,o2)->o2.getValue().compareTo(o1.getValue()));
		             
		             System.out.println("the given array is : "+Arrays.toString(arr));
		             
		             System.out.println("[");
		             
		             for(Entry<Integer,Integer> dec : list)
		             {
		            	int fre= dec.getValue();
		            	
		            	while(fre>1)
		            	{
		            	   System.out.println(dec.getKey()+ " ");
		            	   fre--;
		            	}
		             }
		             
		             System.out.println("]");

	}

}

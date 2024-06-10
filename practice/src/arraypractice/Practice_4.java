package arraypractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How do you remove duplicate elements from an array?
		
		int[] arr = new int[] {13,4,5,6,7,7,7} ;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int element : arr)
		{
			set.add(element);
		}
		
		int[] result= new int[set.size()];
		
		int index=0;
		
		for(int i : set)
		{
			result[index++]=i;
		}
		
		 for(int j : result)
		 {
			 System.out.println(j + " ");
		 }
		
	

	}

}

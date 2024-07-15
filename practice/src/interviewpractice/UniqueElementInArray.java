package interviewpractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[] {1,1,3,3,4,4,5,6,6,6,7,8,8,8};
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int a : arr)
		{
			if(map.containsKey(a))
			{
				map.put(a, map.get(a)+1);
			}
			else
			{
				map.put(a, 1);
			}
		}
		
		Set<Entry<Integer,Integer>> d=map.entrySet();
		
		for(Entry<Integer,Integer> g : d)
		{
			if(g.getValue()==1)
			{
				System.out.println(g.getKey() + " is the unique value  ");
			}
		}
		

	}

}

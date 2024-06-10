package arraypractice;

import java.util.HashMap;

public class Practice_23 {
	
	
	private static  void printsubarray(int[] n ,int start ,int end )
	{
		for(int i=start;i<end;i++)
		{
			System.out.println(n[i] + " ");
		}
	}

	public static void main(String[] args) {
		// Write a Java program which prints all contiguous sub arrays with given sum?
		
		int[] a = new int[] {2, 4, 2, 8, 3, 3, 2, -4, 12};
		int n=8;
		int current=0;//6
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();//0--1,2-0,6-1,
		
		map.put(0,-1);
		
		for(int i=0;i<a.length;i++)
		{
			current=current + a[i];
			
			if(map.containsKey(current-n))
			{
				printsubarray(a,map.get(current-n)+1,i);
			}
			map.put(current, i);
		}
		
		
		
		

	}

}

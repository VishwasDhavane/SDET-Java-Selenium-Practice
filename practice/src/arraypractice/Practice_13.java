package arraypractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice_13 {

	public static void main(String[] args) {
		
 //Write a Java program to remove duplicate elements from an array?
		int[] n = new int[] {3,8,9,3,5,6,2,1,3};
	LinkedHashSet<Integer> g= new LinkedHashSet<>();
	
	for(int i=0;i<n.length;i++)
	{
		g.add(n[i]);
	}
	
	
	System.out.println(g);
		

}
	
}

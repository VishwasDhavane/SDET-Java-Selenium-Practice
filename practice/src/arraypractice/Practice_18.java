package arraypractice;

import java.util.Arrays;

public class Practice_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //How to merge two unsorted arrays in sorted order in Java?
		
		
		int[] a = new int[] {7, -5, 3, 8, -4, 11, -19, 21};
		int[] b= new int[] {6, 13, -7, 0, 11, -4, 3, -5};
		
		int[] with = new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length)
		{
			with[k]=a[i];
			k++;
			i++;
		}
		
		while(j<b.length)
		{
			with[k]=b[j];
			k++;
			j++;
		}
		
		
		Arrays.sort(with);
		
		System.out.println(Arrays.toString(with));
	}

}
package arraypractice;

import java.util.Arrays;

public class Practice_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to merge two sorted arrays in Java?
		
		int[] a = new int[] {-7, 12, 17, 29, 41, 56, 79};
		int[] b= new int[] {-9, -3, 0, 5, 19};
		
		int[] with = new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		
		
		while(i<a.length&&j<b.length)
		{
			if(a[i]<b[j])
			{
				with[k]=a[i];
				i++;
				k++;
			}
			else
			{
				with[k]=b[j];
				j++;
				k++;
			}
		}
		
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
		
		System.out.println(Arrays.toString(with));
			
			
			

	}

}

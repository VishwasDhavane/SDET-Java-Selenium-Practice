package arraypractice;

import java.util.Arrays;

public class Practice_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to separate zeros from non-zeros in an integer array?
		
		int[] n= new int[] {-4, 1, 0, 0, 2, 21, 4};
		
		int[] v= new int[n.length];
		
		int count=0;
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i]!=0)
			{
				v[count]=n[i];
				count++;
			}
		}
		
		System.out.println(Arrays.toString(v));
		
		
		
	int counter = n.length-1;
	
	for(int i=n.length-1;i>=0;i--)
	{
		if(n[i]!=0)
		{
			n[counter]=n[i];
			counter--;
		}
	}
	
	while(counter>=0)
	{
		n[counter]=0;
		counter--;
	}
	
	System.out.println(Arrays.toString(n));
		
		
	}

}

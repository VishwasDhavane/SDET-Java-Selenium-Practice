package leetcodepractice;

import java.util.Arrays;

public class KidsWIthGreatestNumberOfCandies {
	
	
	public static String[] getCandycount(int[] a , int b)
	{
		String[] s = new String[a.length];
		int greatest = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>greatest)
			{
				greatest=a[i];
			}
		}
		
	   for(int j=0;j<a.length;j++)
	   {
		   if(a[j]+b>=greatest)
		   {
			   s[j]="true";
			    
		   }
		   else
		   {
			   s[j]="false";
		   }
	   }
	   return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int[] a = new int[] {2,3,5,1,3};
		int e = 3;
		String[] result =getCandycount(a,e);
		System.out.println(Arrays.toString(result));
	}

}

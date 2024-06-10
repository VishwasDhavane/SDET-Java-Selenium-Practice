package leetcodepractice;

import java.util.Arrays;

public class ProductOfAnArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n= new int[] {1,2,3,4};
		int s=n.length;
		int[] left = new int[s];
		int[] right = new int[s];
		int[] result= new int[s];
		
		left[0]=1;
		for(int i=1;i<s;i++)
		{
			left[i]=left[i-1]*n[i-1];
		}
		
		right[s-1]=1;
		
		for(int j=s-2;j>=0;j--)
		{
			right[j]=right[j+1]*n[j+1];
		}
		
		
		for(int i=0;i<n.length;i++)
		{
			result[i]=left[i]*right[i];
		}
		
		
		for(int num : result)
		{
			System.out.println(num + " ");
		}
		
	}

}

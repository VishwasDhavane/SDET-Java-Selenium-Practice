package interviewpractice;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//left rotation
		
		int[] arr = new int[]{1,2,3,4,5,6};
		int n =2;
		int temp;
		for(int a=0;a<n;a++)
		{
			temp=arr[0];
			
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			
			arr[arr.length-1]=temp;
			
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		//right rotation
		
		
		int t;
		for(int i=1;i<=n;i++)
		{
			t=arr[arr.length-1];
			
			for(int j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			
			arr[0]=t;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}

package arraypractice;

import java.util.Arrays;

public class Practice_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Write a Java program to find continuous sub array whose sum is equal to a given number?
		
		int[] arr= new int[]{15, 51, 7, 81, 5, 11, 25};
		int num=41;
		Arrays.sort(arr);//6,8,12,15,32,42
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int m=j+1;m<arr.length;m++)
				{
					if(arr[i]+arr[j]+arr[m]==num)
					{
						System.out.println("the first number : " +arr[i]+ " the second number is : " +arr[j]+ " the third number is "+arr[m]);
					}
					
				}
			}
		}
		

	}

}

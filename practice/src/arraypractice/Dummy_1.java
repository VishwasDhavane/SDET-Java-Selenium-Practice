package arraypractice;

import java.util.Arrays;

public class Dummy_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {23,45,45,34,23,67,89};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("the duplicate value is : "+arr[i]);
				}
			}
		}
		
        
		Arrays.sort(arr);
		
		
	}

}
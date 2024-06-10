package arraypractice;

public class Practice_5 {
	
	//Write a Java program to find second largest element in an array of integers?
	
	public static void main(String[] args) {
		
		int[] arr= new int[] {2,6,4,9,4,5,78,4};
		int large;
		int second;
		
		if(arr[0]>arr[1])
		{
			large=arr[0];
			second=arr[1];
		}
		else
		{
			large=arr[1];  //6
			second=arr[0];//2
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				second=large;
				large=arr[i];
			}
			
			else if(arr[i]<large && arr[i]>second)
			{
				second=arr[i];
			}
		}
		
		System.out.println(second);
		


		


		
		
	}

}

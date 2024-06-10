package arraypractice;

public class Practice_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number
		
		int[] arr = new int[] {12, 23, 10, 41, 15, 38, 27};
		int num=50;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+ arr[j]==num)
				{
					System.out.println("first number :  " +arr[i]+ " second number : " +arr[j]);
				}
			}
		}
	}

}

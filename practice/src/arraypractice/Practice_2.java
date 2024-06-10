package arraypractice;

public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How do you find a missing number in an array of integers if it contains elements from 1 to n where n is the number of elements?
		
		int arr[]= new int[] {1,3,4,5,6,7,8};
		int n=0;
		int b=0;
		for(int i=0;i<arr.length;i++)
		{
			n=n+arr[i];
			//System.out.println(n);
		}
		
		for(int i=0;i<=8;i++)
		{
			b=b+i;
			//System.out.println(b);
		}
		
		int missing=b-n;
		System.out.println(missing);

	}

}

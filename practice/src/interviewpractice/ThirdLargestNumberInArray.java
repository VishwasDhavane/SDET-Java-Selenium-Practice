package interviewpractice;

public class ThirdLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		int[] a = new int[] {3,5,6,45,23,34,7};
		
		int first=a[0];
		int second = a[0];
		int third=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			
			if(a[i]>first)
			{
				third=second;
				second=first;
				first=a[i];
			}
			else if(a[i]>second && a[i]<first)
			{
				first=second;
				second=a[i];
			}
			else if(a[i]>third && a[i]<second)
			{
				third=a[i];
			}
			
			
		}
		
		System.out.println(third);
		
		
		
		
		
		
	}

}
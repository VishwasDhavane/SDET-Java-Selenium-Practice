package interviewpractice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {1,4,6,7,34,89,90,110,150};
		int key=154;
		boolean flag=false;
		int l=0;
		int h= a.length-1;
		
		while(l<=h)
		{
		int	m=(l+h)/2;
		
		if(a[m]==key)
		{
			System.out.println("the value is found ");
			flag=true;
			break;
		}
		
		else if(a[m]<key)
		{
			l=m+1;
		}
		else 
		{
			h=m-1;
		}
		
		
			
		}
		
		if(!flag)
		{
			System.out.println("the number is not found");
		}
		

	}

}

package arraypractice;

public class Practice_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to find smallest and second smallest element in an integer array?
		
		int[] a = new int[] {3,6,7,2,1,5,6,8};
		int small=a[0];
		int second=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				second=small;
				small=a[i];
			}
			else if(a[i]<second && a[i]>small)
			{
				second=a[i];
			}
		}
 System.out.println("samllet number : "+small);
 System.out.println(" second samllet number : "+second);
 
	}

}

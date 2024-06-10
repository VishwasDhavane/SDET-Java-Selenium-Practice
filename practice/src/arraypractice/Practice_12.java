package arraypractice;

public class Practice_12 {

	public static void main(String[] args) {
		// Write a Java program to find all the leaders in an integer array?
		
		int[] n= new int[] {16, 17, 4, 3, 5, 2};
		
		int max=n[n.length-1];
		
	System.out.println("the first leader is "+n[n.length-1]);
	
	for(int i=n.length-2;i>=0;i--)
	{
		if(n[i]>max)
		{
			System.out.println(n[i]);
			max=n[i];
		}
	}
		
		
	

}
	
}

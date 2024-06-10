package arraypractice;

import java.util.Arrays;

public class Practice_21 {

	public static void main(String[] args) {
		//rite a Java program to find contiguous sub array with maximum sum?
		
		int[] n = new int[] {2, -3, 7, -4, 2, 5, -8, 6, -1};
		
		int bestsum=n[0]; //2
		int beststart=0;
		int bestend=0;
		
		int currentsum=0;
		int currentstart=0;
		
		for(int i=0;i<n.length;i++)
		{
			currentsum=currentsum + n[i];
			
			if(currentsum<0)
			{
				currentsum=0;
				currentstart=i+1;
			}
			else if(currentsum>bestsum)
			{
				bestsum=currentsum;
				beststart=currentstart;
				bestend=i;
			}
		}
		
		
		 System.out.println("Input Array : "+Arrays.toString(n));
         
	        System.out.print("Continous Sub Array With Maximum Sum : ");
	          
	        System.out.print("[ ");
	          
	        for (int i = beststart; i <= bestend; i++) 
	        {
	            System.out.print(n[i]+" ");
	        }
	          
	        System.out.print("]");
	          
	        System.out.println();
	          
	        System.out.println("Sum : "+bestsum);
	    }
		
		

}





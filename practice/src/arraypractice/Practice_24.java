package arraypractice;

import java.util.Arrays;

public class Practice_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = new int[] {1,2,3,4,5,6,7};
		 int n= 2;
		 int temp;
		 
		 for(int i=0;i<n;i++)
		 {
			 temp=a[0];
			 
			 for(int j=0;j<a.length-1;j++)
			 {
				 a[j]=a[j+1];
					 
			 }
			 
			 a[a.length-1]=temp;
		 }
		 
		 System.out.println(Arrays.toString(a));
		 
		 
		 
		 

	}

}

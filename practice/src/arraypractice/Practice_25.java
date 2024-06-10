package arraypractice;

import java.util.Arrays;

public class Practice_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {1,2,3,4,5,6,7};
		 int n= 2;
		 int temp;
		 
		 for(int i=1;i<=n;i++)
		 {
			 temp=a[a.length-1];
			 
			 for(int j=a.length-1;j>0;j--)
			 {
				 a[j]=a[j-1];
			 }
			 
			 a[0]=temp;
		 }
		 
   System.out.println(Arrays.toString(a));
   
   
	}

}

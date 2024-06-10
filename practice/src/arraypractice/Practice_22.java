package arraypractice;

import java.util.Arrays;

public class Practice_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n= new int[] {1,0,1,1,0,1,0,1};
		int count =0;
		int[] a= new int[n.length];
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i]!=0)
			{
				a[count]=n[i];
				count++;
			}
		}
		
		System.out.println(Arrays.toString(a));

	}

}

package leetcodepractice;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {1,0,23,45,0,4,6};
		
		/*
		 * int[] b = new int[a.length]; int count=0;
		 * 
		 * for(int i=0;i<a.length;i++) { if(a[i]!=0) { b[count]=a[i]; count ++; } }
		 * 
		 * 
		 * String c = new String(Arrays.toString(b));
		 * 
		 * System.out.println(c);
		 */
		
		int b=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=a[b];
				a[b]=temp;
				b++;
			}
		}
		
		String v = new String(Arrays.toString(a));
		System.out.println(v);

	}

}

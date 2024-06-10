package arraypractice;

import java.util.HashSet;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = new int[10];
		int[] b= new int[] {1,2,3,4};
		
		
		//intersection of two arrays in java
		
		String[] str=new String[] {"one","two","three","four","five"};
		String[] stv=new String[] {"one","two","three","eight","nine"};
		
		HashSet<String> set= new HashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<stv.length;j++)
			{
				if(str[i].equals(stv[j]))
				{
					set.add(str[i]);
				}
			}
		}
		
	  System.out.println(set);
		
		
	}

}

package arraypractice;

import java.util.HashSet;

public class Practice_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to find the intersection of two arrays
		
		String[] str= new String[]  {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		String[] stv= new String[] {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		
		
		HashSet<String> stu= new HashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<stv.length;j++)
			{
				if(str[i].equals(stv[j]))
				{
					 stu.add(str[i]);
				}
			}
		}
		
		System.out.println("the common numbers are : "+stu);
		

	}

}

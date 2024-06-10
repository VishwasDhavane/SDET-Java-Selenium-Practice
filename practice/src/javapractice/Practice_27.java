package javapractice;

import java.util.Scanner;

public class Practice_27 {
	
	
	
	public static void allsubstrin(String input)
	{
		System.out.println(" enter all the values : ");
		
		for(int i=0;i<input.length();i++)
		{
			for(int j=i+1;j<input.length();j++)
{
	                System.out.println(    input.substring(i, j));
}
		}
		
		
	}

	public static void main(String[] args) {
		// Java program to print all sub strings of a string
		
		Scanner sc = new Scanner(System.in);
		
		String input= sc.next();
		//System.out.println(" enter all the values : ");
		allsubstrin(input);
		sc.close();
		

	}

}

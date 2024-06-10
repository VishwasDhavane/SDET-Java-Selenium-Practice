package javapractice;

import java.util.Arrays;

public class Practice_9 {

	public static void main(String[] args) {
		// Write a Java program to check whether two strings are anagram or not?
		
		String str="funeral";
		
		String stb="real fun";
		String d=stb.replaceAll("\\s", "");
		String f=str.replaceAll("\\s", "");
		
		boolean status =true;
		
		if(f.length()!=d.length())
		{
			status=false;
		}
		else
		{
			
		char 	v[]=d.toCharArray();
		char 	m[]=d.toCharArray();
		Arrays.sort(m);
		Arrays.sort(v);
		
		status=Arrays.equals(v, m);
		
		
			
		}
		
		
		if(status=true)
		{
			System.out.println("It is anagram");
		}
		else
			System.out.println("It is not an anagram");
		

	}

}

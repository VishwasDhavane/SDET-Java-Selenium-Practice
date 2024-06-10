package javapractice;

import java.util.Set;
import java.util.TreeSet;

public class Practice_28 {

	public static void main(String[] args) {
		//Java program to print common characters between two strings in alphabetical order. 
		
		
		String str="thin sticks";
		String stv="thin bricks";
		
		char[] ch =str.replaceAll("\\s+", "").toCharArray();
		char[] cd =stv.replaceAll("\\s+", "").toCharArray();
		
		Set<Character> a= new TreeSet<>();
		Set<Character> b= new TreeSet<>();
		
		for(char c : ch)
		{
			a.add(c);
		}
		
		
		for(char c : cd)
		{
			a.add(c);
		}

		a.retainAll(b);
		
		System.out.println("Common character : "+a);
		
		
	}

}

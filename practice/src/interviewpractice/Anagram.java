package interviewpractice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Silentnm";
		String s2="Listened";
		
		String a = s1.toLowerCase();
		String b = s2.toLowerCase();
		
		
		char[] ch = a.toCharArray();
		char[] cv = b.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(cv);
		
		boolean flag =Arrays.equals(ch, cv);
		
		if(flag)
		{
			System.out.println("its an  anagarma");
		}
		else
		{
			System.out.println("not an anagram");
		}
		
	
		
		
		

	}

}

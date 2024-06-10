package javapractice;

public class Practice_14 {

	public static void main(String[] args) {
		//Write a Java program to prove that strings are immutable in Java?
		
		String s1="java";
		String s2="java";
		
		if(s1==s2)
		{
			
			System.out.println("BOth are the same");
		}
		
		s1=s1+"j2ee";
		
		
		System.out.println(s1);
	}

}

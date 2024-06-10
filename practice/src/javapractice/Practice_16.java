package javapractice;

public class Practice_16 {

	public static void main(String[] args) {
		// How do you swap two string variables without using third or temp variable in Java?
		
		String str="java";
		String stb="kill";
		
		int a=456;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The swapped numbers is a "+a);
		System.out.println("The swapped numbers is b "+b);
		
		
		 str=str + stb;
		 stb=str.substring(0, str.length()-stb.length());
		 str=str.substring(stb.length());
		
		System.out.println(str);
		System.out.println(stb);
		
		
		

	}

}

package javapractice;

public class Practice_3 {

	public static void main(String[] args) {
	//Write a Java program to count the total number of occurrences of a given character in a string without using any loop?

	/*
	 * String str="tatabyebyee"; char ch[]=str.toCharArray(); int count =0;
	 * 
	 * for(int i=0;i<ch.length;i++) { if(ch[i]=='e') { count++;
	 * 
	 * } }
	 * 
	 * System.out.println("The number of occurence  of the charater  a  is " +
	 * count);
	 */
		
		
		String str="tatabyeebyee";
		char ch='t';
		int len=str.length()-str.replace("t","").length();
		System.out.println("The number of occurances of  't' is " +len);
		
	}

}

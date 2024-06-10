package javapractice;

public class Practice_25 {

	public static void main(String[] args) {
		//  How to remove all vowels from a string in Java?
		
		String str="awesome";
		
		String newstr=str.replaceAll("[AEIOUaeiou]","");
		System.out.println(newstr);
		
		
		
	}

}

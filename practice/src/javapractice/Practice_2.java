package javapractice;

public class Practice_2 {

	public static void main(String[] args) {
		
		// Write a Java program to count the number of words in a string?
		
		String str="this is awesome and amazing";
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			System.out.println(" the number of words are " +arr.length);
		}
	}

}

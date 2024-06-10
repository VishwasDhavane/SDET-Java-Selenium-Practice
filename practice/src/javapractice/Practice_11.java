package javapractice;

public class Practice_11 {

	public static void main(String[] args) {
		// Write a Java program to reverse each word of a given string?
		
		
		String str="Java Concept of the day";
		
		     String stb[]=str.split(" ");
		     String reversente="";
		     
		     for(int i=0;i<stb.length;i++)
		     {
		    	 
		    	 String word=stb[i];
		    	 
		    	 String reverseword="";
		    	 
		    	 
		    	 for(int j=word.length()-1;j>=0;j--)
		    	 {
		    		 
		    		 reverseword=reverseword + word.charAt(j);
		    	 }
		    	 reversente=reversente + reverseword + " ";
		     }
		     
		     
		     System.out.println(reversente);
	}

}

package interviewpractice;

public class PalindroneString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madams";
		
	   char[] b = new char[s.length()];
	   int count =0;
	    
	    for(int i=s.length()-1;i>=0;i--)
	    {
	    	b[count]=s.charAt(i);
	    	count++;
	    }
	      String d = new String(b);
	      System.out.println(d);
	   
		if(s.equals(d))
		{
			System.out.println("its a plaindrone");
		}
		else
		{
			System.out.println("its  not a plaindrone");
		}
		

	}
	
	
	

}




/*
 * public static boolean isPalindrome(String str) { str = str.toLowerCase(); //
 * Convert to lowercase for case-insensitive comparison int left = 0; int right
 * = str.length() - 1;
 * 
 * while (left < right) { if (str.charAt(left) != str.charAt(right)) { return
 * false; } left++; right--; }
 * 
 * return true; } }
 */
package interviewpractice;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is plain drone or not
		/*
		 * String s="awesome";
		 * 
		 * boolean ispalin=true;
		 * 
		 * int left=0; int right=s.length()-1;
		 * 
		 * while(left<right) { if(s.charAt(left)!=s.charAt(right)) { ispalin=false;
		 * break; }
		 * 
		 * left++; right--; }
		 * 
		 * if(ispalin) { System.out.println("it is a plaindrone"); } else
		 * System.out.println("it is not a plaindrone");
		 * 
		 */
		//Int is palindrone or not;
		
		int a=1331;
		int org=a;
		
		int rev=0;
		
		while(a>0)
		{
	    int digit = a%10;
		rev=rev*10 + digit;
		a=a/10;
			
		}
		System.out.println(rev);
		
	  boolean flag =(org==rev);
	  if(flag)
	  {
		 System.out.println("it is a palindrone"); 
	  }
	  else
	  {
		  System.out.println("it is not a plaondrone");
	  }
	}

}
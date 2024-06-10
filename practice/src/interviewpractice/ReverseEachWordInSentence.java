package interviewpractice;

public class ReverseEachWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="My name is Pratima";
	    String[] b=	a.split(" ");
	    String r = "";
	    
	    for(int i=0;i<b.length;i++)
	    {
	    	String word = b[i];
	    	String rw="";
	    	for(int j=word.length()-1;j>=0;j--)
	    	{
	    		rw=rw + word.charAt(j);
	    	}
	    	
	    	r= r + rw + " ";
	    }
	    
	    
	    System.out.println(r);
	    
	    
	
}}

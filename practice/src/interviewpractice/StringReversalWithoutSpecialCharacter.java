package interviewpractice;

public class StringReversalWithoutSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abc$fgj**rt#";
	    char[] ch=	a.toCharArray();
		
		int l=0;
		int h=ch.length-1;
		
		 while (l < h) {
	            if (!Character.isLetterOrDigit(ch[l])) {
	                l++;
	            } else if (!Character.isLetterOrDigit(ch[h])) {
	                h--;
	            } else {
	                char t = ch[l];
	                ch[l] = ch[h];
	                ch[h] = t;
	                l++;
	                h--;
	            }
	        }
		
		String cv = new String(ch);
		
		System.out.println("rever of a String "+cv);

	}

}

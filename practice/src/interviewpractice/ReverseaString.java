package interviewpractice;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "awesome";
		char[] c = new char[s.length()];
		int count =0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			c[count]=s.charAt(i);
			count++;
		}
		
		String d = new String(c);
		
		System.out.println(d);

	}

}

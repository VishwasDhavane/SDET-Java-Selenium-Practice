package javapractice;

public class Practice_6 {

	public static void main(String[] args) {
		// Write a Java program to remove all white spaces from a string
		
		
		String str ="This is sparta";
		
	String f=	str.replaceAll("\\s+", "");
	
	System.out.println(f);
	
	char[] ch =str.toCharArray();
	String fg="";
	
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]!=' ' )&& (ch[i]!='\t'))
			{
				fg=fg+ch[i];
			}
		}
		
		System.out.println(fg);
	}

}

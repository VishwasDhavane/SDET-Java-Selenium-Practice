package javapractice;

public class Practice_10 {

	public static void main(String[] args) {
		// Write a Java program to reverse a given string with preserving the position of spaces
		
		String str="This is Sparta";
		/*
		 * char ch[]=str.toCharArray(); int count =0; char bh[]=new char[ch.length];
		 * 
		 * for(int i=ch.length;i<=0;i--) { bh[count]=ch[i]; count++; }
		 * 
		 * String rev=bh.toString();
		 * 
		 * System.out.println("the reverser value is : " +String.valueOf(bh));
		 */
		
		char ch[]=str.toCharArray();
		char bh[]=new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == ' ')
			{
				bh[i]=' ';
			}
		}
		
		int j=bh.length-1;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				
			
				if(bh[j]==' ')
				{
					j--;
				}
				bh[j]=ch[i];
				j--;
				
			}
		}
		
		System.out.println(" the  reverse valeu " + String.valueOf(bh));

	}

}

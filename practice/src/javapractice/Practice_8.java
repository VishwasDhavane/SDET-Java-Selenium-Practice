package javapractice;

public class Practice_8 {

	public static void main(String[] args) {
		//Write a Java program to check whether one string is a rotation of another?
		
		String str = "JavaJ2eeStrutsHibernate";
		String stn= "J2eeStrutsHibernateJavad";
		
		if(str.length()==stn.length())
		{
			
			System.out.println("Can be rotated");
			
		}
		else
		{
			System.out.println("Not of same lenghth");
		}
		
		
		String stb=str+str;
		
		System.out.println(stb);
		
		if(stb.contains(stn))
		{
			System.out.println("it is a rotated version");
		}
		else
		{
			System.out.println("Cant be rotated");
		}
		
		
		
		
		
	}

}

package leetcodepractice;

public class GreatestCommonDivisorOfStrings {
	
	
	public static String gcdof(String s,String s1)
	{
		if(!(s+s1).equals(s1+s))
		{
			return "";
		}
		
		return s.substring(0, gcd(s.length(),s1.length()));
		
	}
	
	public static int gcd(int a, int b)
	{
		if(b==0)
		{
			return a;
		}
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ABCABC";
		String s1="ABC";
		
		System.out.println(gcdof(s,s1));

	}

}
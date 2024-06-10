package interviewpractice;

public class LongestCommonSubSequence {
	
	
	public static int lcf(String s1, String s2)
	{
		int[][] c = new int[s1.length()+1][s2.length()+1];
		
		for(int i=1;i<s1.length();i++)
		{
			for(int j=1;j<s2.length();j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					c[i][j]= 1 + c[i-1][j-1];
				}
				else
				{
					c[i][j]=Math.max(c[i-1][j], c[i][j-1]);
				}
			}
		}
		return c[s1.length()][s2.length()];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcdaf";
		String s2="abcf";
		
		int result = lcf(s1,s2);
		System.out.println(result);

	}

}

package leetcodepractice;

public class MergeStringsAlternatively {
	
	
	
	
	public static String MergeStrings(String s, String s1)
	{
		StringBuilder str = new StringBuilder();
		
		int i=0 ;
	    int j=0;
	  while(i<s.length() || j<s1.length())
		 
	 {
		 if(i<s.length())
		 {
			 str.append(s.charAt(i));
			 i++;
		 }
		 
		 if(j<s1.length())
		 {
			 str.append(s1.charAt(j));
			 j++;
		 }
	 }
	  return str.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input: word1 = "abc", word2 = "pqr"
		//Output: "apbqcr"
		
		
		String s="abc";
		String s1="pqr";
		System.out.println(MergeStrings(s,s1));

	}

}
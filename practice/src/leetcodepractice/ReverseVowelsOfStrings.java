package leetcodepractice;

public class ReverseVowelsOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String s="hello";
	  char[] ch= s.toCharArray();
	  String vowel="aeiouAEIOU";
	 int left =0;
	 int right =ch.length-1;
	 while(left<right)
	 {
		 
		 while(left<right && vowel.indexOf(ch[left])==-1)
		 {
			 left++;
		 }
		 
		 while(left<right && vowel.indexOf(ch[right])==-1)
		 {
			 right--;
		 }
		 
		 
		 if(left<right)
		 {
			char  temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			 left++;
			 right--;
		 }
		 
	 }
	 String f = new String(ch);
	 System.out.println(f);
	
	}

}

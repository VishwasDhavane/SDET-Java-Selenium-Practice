package interviewpractice;

public class ReverseTheEntireSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String a = "My name is Vishwas";
		String[] b=a.split(" ");
		String reverse =" ";
		
		for(int i=b.length-1;i>=0;i--)
		{
			     reverse = reverse + b[i] + " ";
			     
		}
		
		System.out.println(reverse);
		
		
		
	}

}

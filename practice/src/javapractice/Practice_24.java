package javapractice;

public class Practice_24 {

	public static void main(String[] args) {
		//How to reverse a sentence word by word in Java?
		
		String str ="Java Concept Of The Day";
		
		String[] stf=str.split(" ");
		String outputString = "";
		
		//String[] stv= new String[stf.length];
		//int count =0;
		
		for(int i=stf.length-1;i>=0;i--)
		{
			//stv[count]=stf[i];
			//count ++;
			outputString=outputString + stf[i] + " ";
			
		}
		
		//String stb= stv.toString();
		System.out.println(outputString);

	}

}
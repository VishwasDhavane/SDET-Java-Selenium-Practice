package arraypractice;

public class Practice_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java Program to check equality of two array
		
		String[] str= new String[] {"abc","pqr","str","zxc","kvy","sdv"};
		String[] stv= new String[] {"abc","pqr","str","zxc","kvy","sdv"};
		int count=0;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==stv[count])
			{
				count++;
			}
			else
			{
				System.out.println("not equal array");
			}
		}
		if(count==str.length)
		{
			System.out.println("It is an equal array");
		}
		
		
		

	}

}

package interviewpractice;

import java.util.Scanner;

public class PalindroneNumber {
	
	public static boolean isPalindrone(int num)
	{
		int org=num;
		int rev=0;
				
				while(num>0)
				{
					int digit = num%10;
					rev = rev*10 + digit;
					num=num/10;
				}
				
				return org==rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(isPalindrone(num))
		{
			System.out.println("the number "+num+ "is a palindrone");
		}
		else
		{
			System.out.println("the number " + num + "is not a palindrone");
		}
		
sc.close();
	}

}

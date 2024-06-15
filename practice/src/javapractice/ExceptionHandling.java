package javapractice;

public class ExceptionHandling {
	
	
	
	static void validateage(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not a valod age to vote");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	
	static void exampleexception() throws InterruptedException
	{
		
		Thread.sleep(5000);
	}

	public static void main(String[] args) {
		
		
		try
		{
			int[] a = new int[] {1,2,3};
			
		    System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array Index out of bound");
		}
		
		
		try {
			validateage(15);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
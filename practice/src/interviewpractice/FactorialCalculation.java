package interviewpractice;

public class FactorialCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;//5*4*3*2*1
		int fact=1;
		
		
			for(int i=n;i>0;i--)
			{
				fact= fact *i;
			}
		
              System.out.println(fact);
	}

}

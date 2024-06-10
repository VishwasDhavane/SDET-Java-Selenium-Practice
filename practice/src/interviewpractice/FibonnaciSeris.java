package interviewpractice;

public class FibonnaciSeris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f = 10;
		int first =0;
		int second = 1;//0,1,1,2,3,5,8;
		
		System.out.println(first + " " + second);
		
		for(int i=3;i<=10;i++)
			{
				int next = first + second;
				System.out.println(next + " ");
				first=second;
				second=next;
			}
		
       
	}

}

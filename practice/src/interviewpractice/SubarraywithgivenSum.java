package interviewpractice;

public class SubarraywithgivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
		int target = 3;
		int count=0;
		 for(int i=0;i<a.length;i++)
		 {
			 int sum=0;
			 
			 for(int j=i;j<a.length;j++)
			 {
				 
				 sum = sum + a[j];
				 
				 if(sum==target)
				 {
					 count++;
				 }
			 }
		 }
		 
		 System.out.println(count);
		 
		 
		
		
	}

}

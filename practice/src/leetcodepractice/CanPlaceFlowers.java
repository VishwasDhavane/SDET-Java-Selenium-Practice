package leetcodepractice;

public class CanPlaceFlowers {
	
	
	
	
	public static boolean canPlaceFlowers(int[] f,int n)
	{
		
		int count=0;
		
		for(int i=0;i<f.length;i++)
		{
			if(f[i]==0)
			{
				boolean left=(i==0||f[i-1]==0);
				boolean right=(i==f.length-1||f[i+1]==0);
			
			if(left&&right)
			{
				f[i]=1;
				count++;
			
			
			if(count>=n)
			{
				return true;
			
				
			}
			}
			
		}
	}
		return count>=n;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] f = new int[] {1,0,0,0,1};
		int n=1;
		
		int[] f1 = new int[] {1,0,0,0,1};
		int n1=2;
		
		
		System.out.println(canPlaceFlowers(f,n));

	}

}

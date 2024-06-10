package arraypractice;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[] {1,3,5,6,6,7,23,890};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("The duplicate value is "+arr[i]);
				}
			}
		}

	}

}

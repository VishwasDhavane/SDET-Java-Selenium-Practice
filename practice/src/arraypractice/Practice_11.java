package arraypractice;

import java.util.Arrays;

public class Practice_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Moving Zeros To The Front Of An Array :
		
		int[] n= new int[] {-4, 1, 0, 0, 2, 21, 4};
		int count=n.length-1;
		
		for(int i=n.length-1;i>=0;i--)
		{
			if(n[i]!=0)
			{
				n[count]=n[i];
				count--;
			}
		}
     while(count>=0)
    {
	n[count]=0;
	count--;
    }

System.out.println(Arrays.toString(n));


	}

}
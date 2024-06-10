package arraypractice;

import java.util.Arrays;
import java.util.HashSet;

public class Practice_15 {

	public static void intersection(Integer[]...inputArrays)
	{
		
		System.out.println("Input arrays");
		for(Integer[] array : inputArrays)
		{
			System.out.println(Arrays.toString(array));
		}
		
		HashSet<Integer> intersection = new HashSet<Integer>(Arrays.asList(inputArrays[0]));
		
		
		for(int i=0;i<inputArrays.length;i++)
		{
			HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(inputArrays[i]));
			intersection.retainAll(set);
		}
		
		System.out.println(intersection);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inputArray1 = {2, 3, 4, 7, 1};
        
        Integer[] inputArray2 = {4, 1, 3, 5};
          
        Integer[] inputArray3 = {8, 4, 6, 2, 1};
          
        Integer[] inputArray4 = {7, 9, 4, 1};
          
        intersection(inputArray1, inputArray2, inputArray3, inputArray4);

	}

}

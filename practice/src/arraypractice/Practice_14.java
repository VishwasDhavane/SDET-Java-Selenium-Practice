package arraypractice;

import java.util.HashSet;

public class Practice_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] union= new int[][]{
            {1, 2, 3, 4, 5},
            {3, 4, 5, 6},
            {5, 6, 7, 8}
    };
    
    
    HashSet<Integer> set = new HashSet<Integer>();
    
    for(int[] i : union)
    {
    	for(int j : i)
    	{
    		set.add(j);
    	}
    }
    
    System.out.println(set);
    
    

	}

}

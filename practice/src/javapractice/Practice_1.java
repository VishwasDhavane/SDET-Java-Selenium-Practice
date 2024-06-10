package javapractice;

import java.util.HashMap;

import java.util.Set;

public class Practice_1 {
	
	
	//java program to find duplicate words and the number of their occurances

	public static void main(String[] args) {
		
		String str="this is java is java amazing java";
	    String arr[]=str.split(" ");
	    //int count=0;
	    HashMap<String,Integer> map=new HashMap<String,Integer>();
	    
	    for(String word :arr)
	    {
	    	if(map.containsKey(word))
	    	{
	    		map.put(word, map.get(word)+1);
	    	}
	    	else
	    		map.put(word, 1);
	    }
	    
	    Set<String> val=map.keySet();
	    
	    for(String red : val)
	    {
	    	if(map.get(red)>1)
	    	{
	    		System.out.println( red + "  : " + map.get(red));
	    	}
	    }
	

	}

}

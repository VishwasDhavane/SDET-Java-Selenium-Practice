package leetcodepractice;

import java.util.ArrayList;
import java.util.List;

public class SubsetofArrays {
	
	
	public static List<List<Integer>> findsubset(ArrayList<Integer> a, int s)
	{
		List<List<Integer>> result = new ArrayList<>();
		findhelpersubset(a,s,0,new ArrayList<>(),result);
		return result;
	}
	
	
	public static void findhelpersubset(ArrayList<Integer> a, int s,int index,List<Integer> current,List<List<Integer>> result)
	{
		if(s==0)
		{
			result.add(new ArrayList<>(current));
		}
		
		if(s<0||index>=a.size())
		{
			return;
		}
		
		current.add(a.get(index));
		findhelpersubset(a,s-a.get(index),index+1,current,result);
		
		current.remove(current.size()-1);
		findhelpersubset(a,s,index+1,current,result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		int target=5;
		
		List<List<Integer>> subset = findsubset(a,target );
		
		for(List<Integer> sub : subset)
		{
			System.out.println(sub);
		}

	}

}
package week3.day1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] num1 = {1,3,5,7,9,2,6,8};
		List<Integer> arrInt = Arrays.asList(1,3,5,7,9,2,6,8);
		//arrInt.add(0, num1);
		Set<Integer> intTree= new TreeSet<Integer>(arrInt);
		
		System.out.println(intTree);
		for(int i=0;i<intTree.size();i++)
		{
			int j=i+1;
			if(intTree.contains(j))
			{
				//System.out.println("missed no:"+j);
			}
			else
				System.out.println("missed no:"+j);
		}
}
}

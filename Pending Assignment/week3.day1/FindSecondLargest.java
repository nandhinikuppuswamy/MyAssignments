package week3.day1.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> intTree = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			intTree.add(data[i]);
		}
		System.out.println(intTree);
		List<Integer> lstTo= new ArrayList<Integer>();
		lstTo.addAll(intTree);
		System.out.println("Second largest Element:"+lstTo.get(lstTo.size()-2));
	}

}

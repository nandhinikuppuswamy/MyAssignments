package week3.day1.assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";	
		// TODO Auto-generated method stub
int count=0;
String[] strArray  = text.split(" ");
		
		Set<String> random= new LinkedHashSet<String>();
		
		for (int j=0;j<strArray.length;j++) {
			random.add(strArray[j]);
			
		}
		System.out.println("Removing Duplicate:"+random);
	
	}

}

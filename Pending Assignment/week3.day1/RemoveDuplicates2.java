package week3.day1.assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.codec.Charsets;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = "PayPal India";
		char[] chrName = strName.toCharArray();
		Set<Character> charSet = new HashSet<Character>()  ;
		Set<Character> dupCharSet = new HashSet<Character>();
		for (Character character : chrName) {
			if(charSet.contains(Character.toLowerCase(character)))
				dupCharSet.add(character);
			else
			charSet.add(Character.toLowerCase(character));
			
		}
		//System.out.println(charSet);
		//System.out.println(dupCharSet);
		for (Character character : charSet) {
			boolean blnState = Character.isWhitespace(character);
				//System.out.println(0);
			if(!blnState)
				System.out.print(character);
		}
		
	}

}

package week3.day1.assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = "Nandhini";
		char[] chrName = strName.toCharArray();
		Set<Character> setChar = new HashSet<Character>();
		for (Character character : chrName) {
			setChar.add(character);
		}
		System.out.println(setChar);
	}

}

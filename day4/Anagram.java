package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
	
		String text2 = "potss"; 
		 if(text1.length() == text2.length())
		 {
			 boolean flg = true;
			 char[] txt1Array = text1.toCharArray();
			 char[] txt2Array = text2.toCharArray();
			 Arrays.sort(txt1Array);
			 Arrays.sort(txt2Array);
			 for(int i=0;i<txt1Array.length;i++)
			 {
				 
					if(txt1Array[i]!=txt2Array[i])
					{
						flg = false;
						break;
					}
									 
				
			 }
			 if(flg == false)
				 System.out.println("Both words have different characters");
			 else
				 System.out.println("Both words have same characters");
			 
		 }

	}

}

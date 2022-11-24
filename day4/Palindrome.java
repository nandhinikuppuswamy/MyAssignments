package week1.day4;



public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Madam";
		char[] ch1 = str.toCharArray();
		String str2 = "";
		for(int i=ch1.length-1;i>=0;i--)
		{
			str2+= ch1[i];
		
		}
		if(str2.equalsIgnoreCase(str))
			System.out.println("The word '"+str+"' is a palindrome.");

	}

}

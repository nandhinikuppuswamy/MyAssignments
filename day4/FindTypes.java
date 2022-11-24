package week1.day4;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;
				char[] ch1 = test.toCharArray();
				for(int i=0;i<ch1.length;i++)
				{
					char ch2 = ch1[i];
					 if(Character.isLetter(ch2))
						 letter++;
					 else if(Character.isSpaceChar(ch2))
						 space++;
					 else if(Character.isDigit(ch2))
						 num++;
					 else
						 specialChar++;
						 
				}

				// Print the count here
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

				

	}

}

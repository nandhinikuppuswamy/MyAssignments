package week1.day4;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
	      		String test = "I am a software tester"; 
	      		String output = "";
		String[] strSplit = test.split(" ");
		for(int i=0;i<strSplit.length;i++)
		{
			int wrdPosition = i+1;
			int rem=wrdPosition%2;
			if(rem==0)
			{
				char[] ch2 = strSplit[i].toCharArray();
				String revStr = "";
				for(int j=ch2.length-1;j>=0;j--)
				{
					revStr += ch2[j]; 
				}
				output += revStr;
				
			}
			else
			{
				output += strSplit[i];
			}
			if(i!=strSplit.length-1)
				output += " ";
				
				 
		}
		System.out.println(output);
		
		
		 
	

	}

}

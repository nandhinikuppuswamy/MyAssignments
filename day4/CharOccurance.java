package week1.day4;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		
		int cntofE = 0;
		char[] ch1 = str.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i] == 'e' || ch1[i] == 'E')
				cntofE++;
		}
		System.out.println("Number of occurences of E:"+cntofE);
		
		

	}

}

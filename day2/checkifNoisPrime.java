package week1.day2;

public class checkifNoisPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flgIsprime = true;
		int inputNo = 139;
		
		for(int i=2;i<inputNo;i++)
		{
			if(inputNo%i==0)
			{
				System.out.println(inputNo + " is not prime.");
				 flgIsprime = false;
			}
		}
		if(flgIsprime)
			System.out.println(inputNo + " is prime.");

	}

}

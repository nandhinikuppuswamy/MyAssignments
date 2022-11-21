package week1.day1;

public class Mobile1 {
	
	char mobileLogo = 'I';
	short noOfMobilePiece = 2;
	int modelNumber = 4;
	float mobilePrice = 6765.25f;
	boolean isDamaged = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile1 obj1 = new Mobile1();
		System.out.println("Logo of Mobile:" + obj1.mobileLogo);
		System.out.println("Number of Mobiles:" + obj1.noOfMobilePiece);
		System.out.println("Mobile's model number:" + obj1.modelNumber);
		System.out.println("Price of Mobile:" + obj1.mobilePrice);
		System.out.println("Is the mobile damaged:" + obj1.isDamaged);
	}

}

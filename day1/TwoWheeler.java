package week1.day1;

public class TwoWheeler {

	int noOfWheels = 4;
	float mileage = 22.01f;
	boolean isPunctured = true;
	char bikeNameFristLetter = 's';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler obj1 = new TwoWheeler();
		System.out.println("No of Wheels:" + obj1.noOfWheels);
		System.out.println("Mileage given:" + obj1.mileage);
		System.out.println("Is the tyre of bike Puncture:" + obj1.isPunctured);
		System.out.println("First letter of the Bike Name:" + obj1.bikeNameFristLetter);

	}

}

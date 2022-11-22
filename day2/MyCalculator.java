package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator objCalc = new Calculator();
		int addResult = objCalc.add(24,22,200);
		System.out.println("Addition Result is:" + addResult);
		int subResult = objCalc.sub(243,22);
		System.out.println("Subtraction Result is:" + subResult);
		double mulResult = objCalc.mul(45.23,9.09);
		System.out.println("Multiplication Result is:" + mulResult);
		float divResult= objCalc.divide(192.0f,16.0f);
		System.out.println("Division Result is:" + divResult);
		
	}

}

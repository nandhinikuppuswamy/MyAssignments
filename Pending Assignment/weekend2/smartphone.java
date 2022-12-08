package weekend2.assignment;

public class smartphone extends IPhone implements Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartphone objSmart = new smartphone();
		objSmart.Android();
		objSmart.iOS();
		objSmart.itunes();
	}

	public void Android() {
		// TODO Auto-generated method stub
		System.out.println("This is Unimplemented from Interface");
	}

	@Override
	public void itunes() {
		// TODO Auto-generated method stub
		System.out.println("This is unimplemented from abstract class.");
	}
	

}

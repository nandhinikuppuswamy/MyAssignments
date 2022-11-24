package week1.day4;

public class ReversalofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="TestLeaf";
		char[] strCharArray = str.toCharArray();
		for(int i=strCharArray.length-1;i>=0;i--)
		{
			System.out.println("Reversal of String:"+strCharArray[i]);
		}
	}

}

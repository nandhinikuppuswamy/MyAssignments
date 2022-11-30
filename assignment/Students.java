package week2.day3.assignment;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students objStud = new Students();
		objStud.getStudentInfo(209);
		objStud.getStudentInfo(209,"Nila");
		objStud.getStudentInfo("nilaa@gmail.com",987654321l);
		
	}
	public void getStudentInfo(int id)
	{
		System.out.println("The student id is: "+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("The student name with id "+id + " is " + name);
	}
	public void getStudentInfo(String email, long phoneNumber)
	{
		System.out.println("The email of the student is "+email+" and the phone number is "+phoneNumber);
	}

}

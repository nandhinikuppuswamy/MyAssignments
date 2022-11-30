package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student objStd = new Student();
		objStd.collegeName();
		objStd.collegeCode();
		objStd.collegeRank();
		objStd.deptName();
		objStd.studentName();
		objStd.studentId();
		objStd.studentDept();
	}
	
	public void studentName()
	{
		System.out.println("Student Name is Nila.");
	}
	public void studentDept()
	{
		System.out.println("Student DEPT Name is ECE.");
	}
	public void studentId()
	{
		System.out.println("Student ID Name is 29.");
	}

}

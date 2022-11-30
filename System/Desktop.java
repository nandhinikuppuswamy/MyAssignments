package org.System;

public class Desktop extends Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop objDesk = new Desktop();
		objDesk.computerModel();
		objDesk.desktopSize();
				
	}
	public void desktopSize()
	{
		System.out.println("This is child class: Desktopsize: 15");
	}

}

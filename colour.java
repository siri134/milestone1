package com.wipro.flowcontrolstatements;

public class colour {

	public static void main(String[] args) {
		char colour='B';
		switch(colour)		
		{
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
			default:
				System.out.println("Invaid Code");
				}
	}
}
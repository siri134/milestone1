package com.wipro.flowcontrolstatements;

public class charactervariable {

	public static void main(String[] args) {
		char C='2';
		if((C>=65 && C<=90)||(C>=97&& C<=122))
		{
			System.out.println("Alphabet");
		}
		else if(C>1 && C<10000)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
		

	}

}

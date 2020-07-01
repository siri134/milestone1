package com.wipro.flowcontrolstatements;

public class genderperintrest {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]);
		if(age>=1 && age<=58)
		{
			System.out.println("percentage=8.2%");
		}
		else if(age>58 && age<=120)
		{
			System.out.println("percentage=9.2%");
		}
		else
		{
			if(age>=1 && age<=60)
			{
				System.out.println("percentage=9.2%");
			}
			else if(age>=60 && age<=120)
			{
				System.out.println("percentage=8.3%");
			}
		}

	}

}

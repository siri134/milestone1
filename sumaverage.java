package com.wipro.arrays;

public class sumaverage {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("Sum of numbers: "+sum);
		System.out.println("Average of numbers: "+(float)(sum/(args.length)));
	}

}

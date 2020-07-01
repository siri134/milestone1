package com.wipro.arrays;

public class maxmin {

	public static void main(String[] args) {
		int max=0,min=9999;
		for(int i=0;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])>max)
				max=Integer.parseInt(args[i]);
			if(Integer.parseInt(args[i])<min)
				min=Integer.parseInt(args[i]);
		}
		System.out.println("Maximum:"+max);
		System.out.println("Minimum:"+min);
	}

}

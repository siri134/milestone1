package com.wipro.arrays;

public class excluding67sum {

	
		static void sumexcludingrange(int li[], 
                int a, int b) 
{ 
int sum = 0; 
boolean add = true; 

// loop in li 
for (int i = 0;  
i < li.length; i++) 
{ 

// if no != a then add 
if (li[i] != a &&  
add == true) 
sum = sum + li[i]; 

// mark when a  
// and b are found  
else if (li[i] == a) 
add = false; 
else if( li[i] == b) 
add = true; 
} 

// print sum 
System.out.print(sum); 
} 

//Driver Code 
public static void main(String[] args) 
{ 
int lis[] = {10,3,6,1,2,7,9}; 
int a = 6; 
int b = 7; 

sumexcludingrange(lis, a, b); 
} 
} 
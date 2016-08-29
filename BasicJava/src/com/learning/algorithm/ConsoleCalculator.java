package com.learning.algorithm;

public class ConsoleCalculator {

	
	public static void main(String[] args) {
		//Declare the required variables
		double x;
		double y;
		double result=0;
		
		//Assign
		x=30.00;
		y=6.00;
		
		//processing
		result = x+y;
		
		//output
		System.out.println("The sum of "+ x + "and" + y + "is :" + result);
		
		// Subtraction

		  // Assign
		  x = 113.00;
		  y = 13.00;

		  // Processing
		  result = x - y;

		  // output
		  System.out.println("The subtraton " + y + " from " + x + " is :" + result);

		  // Multiplication
		  // Assign
		  x = 100.00;
		  y = 13.00;

		  // Processing
		  result = x * y;

		  // output
		  System.out.println("The multiplication of " + x + " and " + y + " is :" + result);

		  
		  // Division
		  x = 100.00;
		  y = 10.00;

		  // Processing
		  result = x / y;

		  // output
		  System.out.println("The devision " + x + " by " + y + " is :" + result);
		 }
     }
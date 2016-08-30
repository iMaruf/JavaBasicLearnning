package com.learning.algorithm;

import java.util.Scanner;

public class ConsoleCalculator2 {


	public static void main(String[] args) {
		
		System.out.println("Enter two numbers: ");
		
		Scanner cScanner = new Scanner(System.in);
		
		String numOneString = cScanner.next();
		String numTwoString = cScanner.next();
		
		System.out.println("The first token : " + numOneString);
		System.out.println("The first token : " + numTwoString);
		
		double a = Double.parseDouble(numOneString);
		double b = Double.parseDouble(numTwoString);
		
		double sum = Math.addTwoNumbers(a, b);
		double sub = Math.subtractSecondFormFirst(a, b);
		double mul = Math.multiplyTwoNumbers(a, b);
		double div = Math.divideFirstBySecond(a, b);
		double mod = Math.modulusFirstToSecond(a, b);
		
		
		System.out.println("The sum of " + a + " and " + b + " is : " + sum);
		System.out.println("The subtraction of " + a + " from " + b + " is : " + sub);
		System.out.println("The multiplication of " + a + " and " + b + " is : " + mul);
		System.out.println("The divition of " + a + " by " + b + " is : " + div);
		System.out.println("The modulus of " + a + " to " + b + " is: " +mod);

		
		


	}

}

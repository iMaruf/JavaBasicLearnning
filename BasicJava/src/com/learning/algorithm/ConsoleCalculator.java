package com.learning.algorithm;

public class ConsoleCalculator {

	
	public static void main(String[] args) {
		
		double x = 55.00;
		double y = 99.00;
		
		
		Math cMath = new Math();
		
		double sum = cMath.addTwoNumbers(x, y);
		
		System.out.println("The sum of " + x + " and " + y + " is: " + sum);
		
		
		
		double sub = cMath.subtractSecondFormFirst(x, y);
		
		System.out.println("The subtarction of " + x + " form " + y + " is: " + sub);
		
		
		
		double multi = cMath.multiplyTwoNumbers(x, y);
		
		System.out.println("The multiplication of " + x + " and " + y + " is: " + multi);
		
		
		
		double div = cMath.divideFirstBySecond(x, y);
		
		System.out.println("The divition of " + x + " by " + y + " is: " +div);
     }
}
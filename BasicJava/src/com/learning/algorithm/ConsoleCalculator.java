package com.learning.algorithm;

public class ConsoleCalculator {

	
	public static void main(String[] args) {
		
		double x = 55.00;
		double y = 99.00;
		
		
		Math cMath = new Math();
		
		double sum = Math.addTwoNumbers(x, y);
		double sub = Math.subtractSecondFormFirst(x, y);
		double multi = Math.multiplyTwoNumbers(x, y);
		double div = Math.divideFirstBySecond(x, y);
		double mod = Math.modulusFirstToSecond(x, y);
		
		
		System.out.println("The sum of " + x + " and " + y + " is: " + sum);		
		System.out.println("The subtarction of " + x + " form " + y + " is: " + sub);		
		System.out.println("The multiplication of " + x + " and " + y + " is: " + multi);		
		System.out.println("The divition of " + x + " by " + y + " is: " +div);
		System.out.println("The modulus of " + x + " to " + y + " is: " +mod);
     }
}
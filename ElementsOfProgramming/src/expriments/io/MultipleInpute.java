package expriments.io;

import java.util.Scanner;

public class MultipleInpute {

	
	public static void main(String[] args){
		
		System.out.println("Please enter your name:");
		
		Scanner scan = new Scanner(System.in);
		
		 String inputString = scan.nextLine();
		
		scan.close();
		
		System.out.println("Hello, World.");
		
		System.out.println(inputString);
		
		
		
	}
}

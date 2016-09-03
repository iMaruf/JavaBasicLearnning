package com.learning.algorithm;

import java.util.Scanner;

public class Hello {

	static Scanner ab = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		System.out.println("May I know your name please? \n");
		
		String name = ab.nextLine();
		System.out.println("Hello !! " + name);

	}

}

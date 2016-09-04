package my.project;

import java.util.Scanner;

public class DayOne {

	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		println("May I know your name please? \n ");
		
		String yourName;
		yourName = ab.nextLine();
		
		System.out.print("Previous method ");
		System.out.println(yourName);
		
		println("This is new method: :)");
		print(yourName);
		
		println("\n\n The number of characters in your name is : " + yourName.length());
	}
	static void println(Object anyObject){
		System.out.println(anyObject);
	}
	static void print(Object anyObject){
		System.out.print(anyObject);
	}
}

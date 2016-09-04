package my.project;

public class DayOne {

	public static void main(String[] args) {
		
		String myName;
		myName = new String(" Aariz ");
		
		System.out.print("Previous method");
		System.out.println(myName);
		
		println("This is new method: :)");
		print(myName);
		
		println("\n\n The number of characters in your name is : " + myName.length());
	}
	static void println(Object anyObject){
		System.out.println(anyObject);
	}
	static void print(Object anyObject){
		System.out.print(anyObject);
	}
}

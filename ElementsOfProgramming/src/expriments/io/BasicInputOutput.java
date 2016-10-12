package expriments.io;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BasicInputOutput {

	
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Please input your number: ");
		Double n=readDoubleFromConsole();
		System.out.println(n + " is your input number.");
		System.out.println("Please enter your name : ");
		String s=readStringFromConsole();
		System.out.println(" Hi, " + s + " Have a good day.");

	}
	
	public static double readDoubleFromConsole(){
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String line="";
		try {
			line=bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Double.parseDouble(line);
	}
	
	public static String readStringFromConsole(){
		
		BufferedReader st=new BufferedReader(new InputStreamReader(System.in));
		String line="";
		try {
			for(int i=0; i<5; i++){
				line=st.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
		
	}
	


}

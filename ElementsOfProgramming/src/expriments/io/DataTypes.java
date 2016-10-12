package expriments.io;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int e;
        double t;
        String g;

        /* Read and save an integer, double, and String to your variables.*/
        String temp=null;
        temp = scan.nextLine();
        e=Integer.parseInt(temp);
        temp=scan.nextLine();
        t=Double.parseDouble(temp);
        g=scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        int sum;
        sum=i + e;
        
        System.out.println(sum);

        /* Print the sum of the double variables on a new line. */
        double doubleSum;
        doubleSum=d + t;

        System.out.println(doubleSum);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        String sumCon;
        sumCon=s + g;

        System.out.println(sumCon);
        scan.close();
        }
    }
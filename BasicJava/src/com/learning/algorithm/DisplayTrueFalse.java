package com.learning.algorithm;

public class DisplayTrueFalse {

	
	public static void main(String[] args) {
		
		int[] array = {1,3,5,7,9,11,33,55,777};
		
		boolean stat=process(array[7], array[8]);
		
		System.out.println(stat);
	
	}
	static public boolean process(int firstValue, int secondValue){
		boolean result = firstValue>secondValue;
		return result;
	}
}

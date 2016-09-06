package com.learning.algorithm;

public class Task {

	
	public static void main(String[] args) {
		
		int[] cards = {1,3,5,7,9,11,33,55,777};
		
		boolean stat=pro(cards[7], cards[3]);
		
		System.out.println(stat);
	
	}
	static public boolean pro(int firstValue, int secondValue){
		boolean answer = firstValue>secondValue;
		return answer;
	}
}

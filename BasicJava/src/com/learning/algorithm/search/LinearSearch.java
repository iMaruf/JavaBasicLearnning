package com.learning.algorithm.search;

public class LinearSearch {


	public static void main(String[] args) {
		
		int[] number={3,5,8,13,13,22,35,57};
		
		int searchItem=13;
		
		int index=linearSearch(number,searchItem);
		
		if(index==-1){
			System.out.println(searchItem+"does not exit in the given array");
		}else{
			System.out.println(searchItem + " exist in the given array at position: " + index);
		}

	}

	public static int linearSearch(int[]data,int searchItem){
		int foundItemFlag=0;
		int index=-1;
		for(int i=0; i<data.length; i++){
			if(data[i]==searchItem){
				foundItemFlag++;
				index=i;
				
				if(foundItemFlag==2){
					return index;
				}
			}
		}
		return -1;
	}
	
}

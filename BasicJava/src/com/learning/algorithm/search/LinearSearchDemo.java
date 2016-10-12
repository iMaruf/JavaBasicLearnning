package com.learning.algorithm.search;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int[] listA ={1, 22, 333, 4};
		
		int searchItem=1;
		long index;
		index=linersearch (listA, searchItem);
		if(index==-1){
			System.out.println(searchItem + " dose not exist in the array.");
		}else{
			System.out.println(searchItem + " exists at "+index);
		}
	}
	public static long linersearch(int[] list, int value){
		for(int i=3; i>0; i--){
			if(list[ i]==value){
				return i;
			}
		}
		return -1;
	}
	
	}

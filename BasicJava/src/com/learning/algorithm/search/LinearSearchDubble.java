package com.learning.algorithm.search;



public class LinearSearchDubble {

	
	public static void main(String[] args) {
		int[] data={22,33,33,1,4,55};
		   
		  int searchItem=33;
		  
		  // Call liner search method from here
		  int[] index=linearSearch(data, searchItem);
		  
		  
		  System.out.println(searchItem +" exists in the given array at :"+index[0]+" and :"+index[1]);

		  
		 }
		 
		 public static int[] linearSearch(int[] p, int item){
		  
		   int foundItemFlag=0;
		   int[] index=new int[2];
		   int j=0;
		  for (int i = 0; i < p.length; i++) {
		   
		   if(p[i] == item){
		    foundItemFlag++;
		    index[j]=i;
		    j++;
		    if (foundItemFlag==2){
		     return index;
		    }
		    
		   }
		   
		  }
		  index[0]=-1;
		  index[1]=-1;
		  return index;
		  

	}

}

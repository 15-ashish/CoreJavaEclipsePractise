package com.lab;

public class OddEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] even=new int[10];
      int[] odd=new int[10];
      int[] arr= {1,3,6,88,89,34,56,32,12,11,7,9,5};
      int i,j=0,k=0;
      for(i=0;i<arr.length;i++)
      {
    	  if(arr[i]%2==0)
    		  even[j++]=arr[i];
    	  else
    		  odd[k++]=arr[i];
    	      
    }
      System.out.print("even array \n");
      for(i=0;i<even.length;i++)
      {
    	 
    	  System.out.print(even[i]+"\t");
	}

      System.out.println("\n odd array");
      for(i=0;i<odd.length;i++)
      {
    	 
    	  System.out.print(odd[i]+"\t");
	}
}
}

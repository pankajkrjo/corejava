package org.java.Arrays;

public class ArrayLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr=new int[] {12,34,89,67,78,90};
         int largest=-1;
         
         for(int i=0; i<arr.length;i++) {
        	  if(arr[i]>largest) {
        		  largest=arr[i];
        	  }
         }
         System.out.println("Largest elemetns " +largest);
	}

}

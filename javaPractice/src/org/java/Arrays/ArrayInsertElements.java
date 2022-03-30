package org.java.Arrays;

import java.util.Scanner;

public class ArrayInsertElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[10];
		  
		   Scanner sc=new Scanner(System.in);
		   for(int i=0;i<10;i++) {
			   System.out.println("Enter array element at index : " +i);
			   arr[i]=sc.nextInt();
		   }
		   for(int i=0; i<arr.length;i++) {
			   System.out.println("Array elements :" +arr[i]);
		   }

	}

}

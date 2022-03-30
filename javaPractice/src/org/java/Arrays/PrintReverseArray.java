package org.java.Arrays;

import java.util.Scanner;

public class PrintReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		
		//add element to array arr
		for(int i=0;i<5;i++){
			System.out.println("Enter array element at index : "+ i);
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Elements contained in array in reverse order: ");
		//traverse array element and print
		for(int j=arr.length-1; j>=0; j--){
			System.out.println(arr[j]);
		}

	}

}

package org.java.Arrays;

import java.util.Scanner;

public class CountOddIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		
		//add element to array arr
				for(int i=0;i<5;i++){
					System.out.println("Enter array element at index : "+ i);
					arr[i] = scan.nextInt();
				}
				
				int countOddIntegers = 0;
				System.out.println("Odd integers in array arr are: ");
				//traverse array element and print
				for(int j=0; j<arr.length;j++) {
					// check for odd elements
					if(arr[j]%2!=0) {
						System.out.println(arr[j]);
						
						countOddIntegers++;
						
					}
				}
				System.out.println("Total odd integers in array = "+ countOddIntegers);

	}

}

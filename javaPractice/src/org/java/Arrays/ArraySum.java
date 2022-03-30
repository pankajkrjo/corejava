package org.java.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {13, 17, 18, 23, 35, 65};
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of arry element "+ sum);
		
		float average = (float)sum/arr.length;
		System.out.println("average of array elements: "+ average);

	}

}

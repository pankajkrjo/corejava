package org.java.Arrays;

public class ArrayLowestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr=new int [] {89,23,90,12,33};
		
		int lowest=100000;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<lowest){
				lowest=arr[i];
			}
		}
		System.out.println("Lowest element in array = "+ lowest);


	}

}

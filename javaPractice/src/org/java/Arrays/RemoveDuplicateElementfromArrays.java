package org.java.Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementfromArrays {
	
	
	public static void removeduplicate(int []arr,int n) {
		
		Set<Integer> st=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
		  if(!st.contains(arr[i])){
			    st.add(arr[i]);
		  }
		  }
		System.out.println(st.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {12,3,1,3,9,3,1,2,2,2};
		 int len=arr.length;
		
		 RemoveDuplicateElementfromArrays.removeduplicate(arr, len);
		

	}

}


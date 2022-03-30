package org.java.objects;

public class LuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int sum=0;
	  int [] arr= {4,6,7};
	   for(int i=0;i< arr.length-1;i++) {
		    
		 sum=sum+arr[i] ;
	   }
	   if(sum>9) {
		   System.out.println("luck number" + sum);
	   }
	   

	}

}

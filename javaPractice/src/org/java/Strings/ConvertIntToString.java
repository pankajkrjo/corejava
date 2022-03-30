package org.java.Strings;

public class ConvertIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int num=111;
		String sNum=String.valueOf(num);
		
		System.out.println("The value of sNum = "+ sNum);
		System.out.println("Type of sNum is "+ sNum.getClass().getName());
		
		int nums = 112;
		String sNums = "" + nums;
		
		System.out.println("The value of sNum = "+ sNums);
		System.out.println("Type of sNum is "+ sNums.getClass().getName());


	}

}

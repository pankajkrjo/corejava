package org.java.Strings;

import java.util.Arrays;

public class SplitWithoutlimitParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String vowels= "a::b::c::d:e";
		String[] result=vowels.split("::");
		
		//convert Array to String/
		 System.out.println("result" +Arrays.toString(result));
		
	}

}

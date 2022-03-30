package org.java.Strings;

import java.util.Arrays;

public class splitAttheCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String vowels = "a+e+f";
		
		String[] results=vowels.split("\\+");
		
		System.out.println("results"+ Arrays.toString(results));

	}

}

package org.java.Strings;

public class ReplaceMethod {
	
	public static void main(String args[]) {
		String str1="c++";
		
		  // all occurrences of "C++" is replaced with "Java"
	    System.out.println(str1.replace("C++", "Java"));  // Java Programming


	    // all occurences of "aa" is replaced with "zz"
	    System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

	    // substring not in the string
	    System.out.println("Java".replace("Java", "C")); // Java
	}

}

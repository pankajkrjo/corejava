package org.java.Strings;

public class TrimMethod {

	public static void main(String[] args) {
		
		   String str1="   Learn Java Programming      ";
		   System.out.println(str1.trim());
		   
		   String str2= "     Learn   Java Programming ";
		    String str3 = "Learn\nJava Programming\n\n   ";
		    
		    System.out.println(str2.trim());
		    System.out.println(str3.trim());
		    
		    String str4 = "Learn\nJava \n\n   ";
		    String result;
		    
		 // replace all whitespace characters with empty string
		    result = str4.replaceAll("\\s", "");

		    System.out.println(result);   // LearnJava

		    
		    System.out.println(str1.charAt(2));
		    
		 // convert to lowercase letters
		    System.out.println(str1.toLowerCase());  // "learn java"
		    System.out.println(str2.toLowerCase().trim());  // "java123"
		    
		    
		    // concatenate str1 and str2
		    System.out.println((str1.concat(str2)).trim());
	}

}

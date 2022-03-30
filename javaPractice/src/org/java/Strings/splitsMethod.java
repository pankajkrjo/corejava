package org.java.Strings;

public class splitsMethod {
	
	public static void main(String args[])
	{
	    String text = "Java is a fun programming language";

	     String[] result=text.split(" ");
	     
	     System.out.println("values");
	     for(int i=0; i<result.length;i++) {
	    	 
	    	 System.out.print(result[i]+" ");
	     }
	}
}

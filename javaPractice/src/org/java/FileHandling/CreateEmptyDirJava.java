package org.java.FileHandling;

import java.io.File;

public class CreateEmptyDirJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  /Users/pankajkumar/Downloads/Software
		 
		 File file=new File("/Users/pankajkumar/Downloads/pandemo");
		 file.mkdir();
		 System.out.println("Directory created:"+ file.getName());
		 
		   if(file.isDirectory()) {
			    System.out.println("it is Directory");
		   }
		   else {
			   System.out.println("not Directory");
		   }

	}

}

package org.java.CreateEmptyFileJava;

import java.io.File;
import java.io.IOException;

public class CreateEmptyFileJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 File file=new File("/Users/pankajkumar/Downloads/pandemo/pankaj.txt");
		  try {
			  file.createNewFile();
			  System.out.println("File is created with name"+file.getName()+ "At absulate path");
		  }
		  catch(IOException e) {
			  System.out.println(e);
		  }
		  //file delete
		 // file.delete();
		  
		   System.out.println("File deleted"+ file.getName());

	}

}

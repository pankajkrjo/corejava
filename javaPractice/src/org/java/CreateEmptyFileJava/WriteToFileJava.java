package org.java.CreateEmptyFileJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter file;
		try {
			file = new FileWriter("/Users/pankajkumar/Downloads/pandemo/pankaj.txt");
			System.out.println("Writing into the file");
			file.write("hi pankaj, how are you");
			System.out.println("file writing completed");
			file.close();
		} catch (IOException e) {
			System.out.println("Exception occured while writing");
			e.printStackTrace();
		}
		
		

	}

}

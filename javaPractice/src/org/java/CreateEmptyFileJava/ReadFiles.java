package org.java.CreateEmptyFileJava;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class ReadFiles {

	 public static void readFileContent(String path) {
		 String	paths = "/Users/pankajkumar/Downloads/pandemo/pankaj.txt";
			
		 File file=new File(paths);
		 
		 try {
			List<String>  obj=Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
			 for(String value:obj) {
				 System.out.println(value);
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		try {
			readFileContent(str);
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}

	}

}

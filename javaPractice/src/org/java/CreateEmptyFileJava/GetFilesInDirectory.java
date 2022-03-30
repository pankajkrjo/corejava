package org.java.CreateEmptyFileJava;

import java.io.File;
import java.util.Scanner;

public class GetFilesInDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter path where files are to be searched:");
		String path = sc.nextLine();
		checkFilesInDirectory(path);

	}

	private static void checkFilesInDirectory(String path) {
		
		File directory = new File(path);
		File[] files = directory.listFiles();
		
		for(File file : files){
			if(file.isDirectory()){
				checkFilesInDirectory(file.getAbsolutePath());
			}else{
				System.out.println("File name"+ file);
			}
		}
		
	}

}

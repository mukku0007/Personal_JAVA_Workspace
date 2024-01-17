package com.file;

import java.io.File;
import java.io.IOException;

public class Create_File {
	
	public static void main(String[] args) {
		
		File file = new File("data.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("New File Created Sucessfully");
			}
			
			else {
				System.out.println("File Creation Error");
			}
		}
		
		catch(IOException e) {
			System.out.println("File Error");
		}
	}
}

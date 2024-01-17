package com.file;

import java.io.File;

public class Delete_File {
	
	public static void main(String[] args) {
		
		File file = new File("data1.txt");
		
		if(file.delete()) {
			System.out.println("File Deleted: " + file.getName() + "Successfully");
		}
		
		else {
			System.out.println("Failed to Delete File");
		}
			
	}
}

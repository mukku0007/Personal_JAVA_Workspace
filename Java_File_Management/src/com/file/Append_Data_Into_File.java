package com.file;

import java.io.FileWriter;
import java.io.IOException;

public class Append_Data_Into_File {

	public static void main(String[] args) {
		
		String data = "This Data is Appended";
		
		try {
			FileWriter output = new FileWriter("data1.txt",true);
			output.write(data);
			System.out.println("Data Append Successfully");
			output.close();
		} 
		
		catch (IOException e) {
			System.out.println("File Append Error");
		}
	}
}

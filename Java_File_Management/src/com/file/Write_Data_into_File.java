package com.file;

import java.io.FileWriter;
import java.io.IOException;

public class Write_Data_into_File {

	public static void main(String[] args) {
		
		String data = "101, Mukesh Kumar, Noida"; 
		
		try {
			FileWriter output = new FileWriter("data1.txt");
			output.write(data);
			System.out.println("Data is Written Successfully");
			output.close();
		} 
		
		catch (IOException e) {
			System.out.println("File Write Error");
		}
	}
}

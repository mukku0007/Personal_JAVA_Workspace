package com.file;

import java.io.FileReader;
import java.io.IOException;

public class Read_Data_from_File {

	public static void main(String[] args) {
		
		char[] data = new char[100];
		
		try {
			FileReader input = new FileReader("data1.txt");
			input.read(data);
			System.out.println("Data Read Successfully");
			System.out.println(data);
			input.close();
		} 
		
		catch (IOException e) {
			System.out.println("File Read Error");
		}
	}
}

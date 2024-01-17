package com.file;

//Java Program to demonstrate createTempFile() method

import java.io.*;

public class Solution {

	public static void main(String args[]) {
		try {

			// create a temp file
			File f = File.createTempFile("geeks", ".SVP", new File("D:"));

			// check if the file is created
			if (f.exists()) {

				// the file is created
				// as the function returned true
				System.out.println("Temp File created: " + f.getName());
			}

			else {

				// display the file cannot be created
				// as the function returned false
				System.out.println("Temp File cannot be created: " + f.getName());
			}
		}

		catch (Exception e) {

			// display the error message
			System.err.println(e);
		}
	}
}

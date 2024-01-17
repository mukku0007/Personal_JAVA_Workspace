package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileNotFoundExceptionDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the name of the file you want to read / write: ");
		String filename = scanner.nextLine();

		System.out.println("Would you like to read / write this file(R/W): ");
		boolean isWrite = scanner.nextLine().trim().charAt(0) == 'W';

		// If User want to write
		String contentToWrite = "";
		if (isWrite) {
			System.out.println("Enter a sentence to write in a file: ");
			contentToWrite = scanner.nextLine();
		}

		// Perform to Read / Write operation
		if (isWrite) {
			try {
				// Here open the file
				FileOutputStream fileOutputStream = new FileOutputStream(filename);
				PrintWriter printWriter = new PrintWriter(fileOutputStream);

				// Write the File
				printWriter.println(contentToWrite);

				// Close the File
				printWriter.close();
				fileOutputStream.close();
			} catch (FileNotFoundException e) {
				System.out.printf("ERROR - A %s Occured: \n\t%s\n", e.getClass().toString(), e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// Here Read Operation
		else {
			try {
				FileInputStream fileInputStream = new FileInputStream(filename);
				Scanner scanner2 = new Scanner(fileInputStream);

				// Read the File
				while (scanner2.hasNextLine()) {
					System.out.println("\t" + scanner2.nextLine());
				}

				// Close the File
				fileInputStream.close();
				scanner2.close();
			} catch (FileNotFoundException e) {
				System.out.printf("ERROR - A %s Occured: \n\t%s\n", e.getClass().toString(), e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}

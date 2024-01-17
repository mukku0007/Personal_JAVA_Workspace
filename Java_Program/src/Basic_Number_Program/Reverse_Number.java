package Basic_Number_Program;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt(); 
		int reverse = 0;
		while (number != 0) 
		{
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	 }
}
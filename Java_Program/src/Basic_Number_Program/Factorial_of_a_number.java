package Basic_Number_Program;

import java.util.Scanner;

//program to display Factorial of a number
public class Factorial_of_a_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,i, fact = 1;
		
		System.out.println("Enter a Number");
		n = sc.nextInt();
		
		for(i = 1; i<=n; i++)
		{
			fact = fact*i;
		}
		System.out.println("The Factorial of Number is: "+fact);
	}
}

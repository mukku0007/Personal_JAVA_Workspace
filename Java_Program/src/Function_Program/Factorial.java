package Function_Program;

import java.util.Scanner;

public class Factorial {

	static int fact(int n)
	{
		int result = 1;
		for(int i = 1; i<=n; i++)
		{
			result *= i; 
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		int print = fact(n);
		System.out.println("Factorial of Number "+n+" is: " +print);
		
	}
}

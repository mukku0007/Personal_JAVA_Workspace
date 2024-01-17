package Basic_Number_Program;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 1, c, i; 
		
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		System.out.println(a+" "+b+" ");
		for(i = 3; i<=n; i++)
		{
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}

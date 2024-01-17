package Function_Program;

import java.util.Scanner;

// Find the Number of Trailing Zero in a Factorial

public class Trailing_Zero {
	
	static int trailZero(int n)
	{
		int res = 0;
		int powOf5 = 5;
		while(n >= powOf5)
		{
			res = res + (n/powOf5);
			powOf5 = powOf5 * 5;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int result = trailZero(n);
		System.out.println(result);
	}
}

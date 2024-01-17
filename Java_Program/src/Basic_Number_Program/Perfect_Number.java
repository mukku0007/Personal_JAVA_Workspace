package Basic_Number_Program;

import java.util.Scanner;

// Find if a number is a perfect number. 
// A perfect number is number which is equal to sum of its divisor or factor except itself e.g. 6=1+2+3
public class Perfect_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		for(int i=1; i<n;i++)
		{
			if(n%i == 0)
			{
				sum = sum+i;
			}
		}
		if(sum == n)
		{
			System.out.println("Yes, It is Perfect Number");
		}
		else
		{
			System.out.println("No, It is Not Perfect Number");
		}
	}
}

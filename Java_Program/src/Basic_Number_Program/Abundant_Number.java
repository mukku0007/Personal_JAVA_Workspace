package Basic_Number_Program;

import java.util.Scanner;

// Find if a number is an Abundant number. 
// Here sum of factor is greater then the number. itself e.g. 12 factors are 1,2,3,4,6 = 16 > 12, Here 16 is greater then 12 so it is Abundant Number.
public class Abundant_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		for(int i=1; i<n; i++)
		{
			if(n%i == 0)
			{
				sum = sum + i;
			}
		}
		
		if(sum > n)
		{
			System.out.println("Yes, It is Abundant Number");
		}
		else 
		{
			System.out.println("No, It is not Abundant Number");
		}
	}
}

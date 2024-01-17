package Basic_Number_Program;

import java.util.Scanner;

// Find if number is a Deficient number. 
// Here sum of factor is less than the no itself. e.g. 21 factors are 1,3,7 = 11<21
public class Deficient_Number {

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
		if(sum < n)
		{
			System.out.println("Yes, It is Deficient Number");
		}
		else
		{
			System.out.println("No, It is not Deficient Number");
		}
	}
}

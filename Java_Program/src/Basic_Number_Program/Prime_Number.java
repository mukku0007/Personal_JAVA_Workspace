package Basic_Number_Program;

import java.util.Scanner;
// Find if a number is prime number. 
// Prime number is a number divisible by 1 and itself e.g 5 is a prime number as it has factor only 1,5
public class Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;

		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count ++;
			}
		}
		if(count == 2)
		{
			System.out.println("Yes, It is Prime Number");
		}
		else
		{
			System.out.println("No, It is not a Prime Number ");
		}
			
	}
}

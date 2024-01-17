package Basic_Number_Program;

import java.util.Scanner;

// Find if number is a Pronic Number. 
// Pronic Number is the product of two consecutive integers, n(n+1). e.g. 56=7×8
public class Pronic_Number {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int fact = 0;
		
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		for(int i=1; i<n; i++)
		{
			if(i*(i+1)==n)
			{
				fact = i;
			}
		}
		if(fact!=0)
		{
			System.out.println("Yes, It is Pronic Number");
		}
		else
		{
			System.out.println("No, It is not Pronic Number");
		}
	}
}

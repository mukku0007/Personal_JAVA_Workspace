package Basic_Number_Program;

import java.util.Scanner;

// Find if a number is a composite number. 
// Composite number is a number which has more than two factor(excluding 1 and itself) e.g 8=2, 4=2 factors
public class Composite_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			{
				count ++;
			}
		}
		if(count > 3)
		{
			System.out.println("Yes, It is Composite Number");
		}
		else
		{
			System.out.println("No, It is not Composite Number");
		}
	}
}

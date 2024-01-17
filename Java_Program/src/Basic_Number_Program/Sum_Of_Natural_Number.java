package Basic_Number_Program;

import java.util.Scanner;

public class Sum_Of_Natural_Number {

	public static int findSum(int n)
	{
		int sum = 0;
		for(int i=1; i <=n; i++)
		{
			sum = sum + i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Natural Number");
		int n = sc.nextInt();
		int sum = findSum(n);
		System.out.println(sum);
	}
}

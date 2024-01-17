package Basic_Number_Program;

import java.util.Scanner;

public class Print_All_Factors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		System.out.println("All the Factors of Given Number "+n+" is: ");
		for(int i = 1; i<=n; i++)
		{
			if(n%i == 0)
			{
				System.out.println(i);
			}
		}
	}
}

package Basic_Number_Program;

import java.util.Scanner;

public class LCM_HCF_Of_Two_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hcf = 0;
		
		System.out.println("Enter Two Number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int min = Math.min(n1, n2);
		for(int i = 1; i < min; i++)
		{
			if(n1 % i == 0 && n2 % i ==0)
			{
				hcf = i;
			}
		}
		System.out.println("HCF of "+n1+ " and "+n2+ " is: "+hcf);
		System.out.println("LCM of "+n1+ " and "+n2+ " is: "+((n1*n2)/hcf));
	}
}

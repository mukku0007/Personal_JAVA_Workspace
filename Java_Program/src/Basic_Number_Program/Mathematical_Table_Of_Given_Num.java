package Basic_Number_Program;

import java.util.Scanner;

public class Mathematical_Table_Of_Given_Num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num = sc.nextInt();
		System.out.println("Table of "+num);
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}

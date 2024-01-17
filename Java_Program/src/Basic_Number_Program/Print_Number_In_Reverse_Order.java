package Basic_Number_Program;

import java.util.Scanner;

public class Print_Number_In_Reverse_Order {

	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 int reverseNumber = 0, digit;
		 
		 System.out.println("Enter Number");
		 int num = sc.nextInt();
	     
		 while(num!= 0)
	     {
	        digit = num % 10;
	        reverseNumber = reverseNumber * 10 + digit;
	        num = num/10;
	     }
	     System.out.println ("Reverse Number is : " +reverseNumber);
	 }
}

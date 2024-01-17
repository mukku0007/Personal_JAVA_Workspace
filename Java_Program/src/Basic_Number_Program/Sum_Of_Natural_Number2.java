package Basic_Number_Program;

import java.util.Scanner;

public class Sum_Of_Natural_Number2 {

	public static int findSum2(int n)
	{
		return n * (n+1)/2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Natural Number");
		int n = sc.nextInt();
		
		int result = findSum2(n);
		System.out.println(result);
		
		// Here we find the Time Complexity of this Program.
		double now = System.currentTimeMillis();
		Sum_Of_Natural_Number2 demo = new Sum_Of_Natural_Number2();
		
		System.out.println(demo.findSum2(25));
		System.out.println("Time Taken - " +(System.currentTimeMillis() - now) + " millisec");
	}
}

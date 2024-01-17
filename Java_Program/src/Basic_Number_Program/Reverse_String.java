package Basic_Number_Program;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name");
		String name = sc.nextLine();
		String reverse = "";
		int length = name.length();
		for(int i = length-1; i >= 0; i--)
		{
			reverse = reverse + name.charAt(i);
		}
		System.out.println("Reverse of "+name+" is: "+reverse);
	}
}

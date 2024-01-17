package binary_literal;

/*
 Binary Literals:-
 
 Binary Literals allows you to express integral types (byte, short, int, and long) in binary number system. 
 To specify a binary literal, add the prefix 0b or 0B to the integral value.
 
 
 */

public class Binary_Literal_Demo 
{
	public static void main(String[] args) 
	{
		int a = 101;
		System.out.println(a);
		
		//Here we can represent binary literal through 0B or 0b.
		int b = 0B101; 
		System.out.println(b);
		
		int c = 0b100_00_00_00_00;
		System.out.println(c);
	}
}

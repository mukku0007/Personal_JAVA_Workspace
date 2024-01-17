package multiple_catch_exception;

/*
 Multiple Catch Exception:-
 
 Java allows you to catch multiple type exceptions in a single catch block.
 It was introduced in Java 7 and helps to optimize code.
 You can use vertical bar (|) to separate multiple exceptions in catch block.

 */

public class Mutiple_Cache_Exception_Demo 
{
	public static void main(String[] args) 
	{
		try 
		{
			//int a = 20, b = 0;
			//int c = a/b;
			
			int array[] = new int [10];
			array[10] = 30/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

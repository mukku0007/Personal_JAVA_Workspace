package logger;

public class Test 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		
		System.out.println("Calling Add Method");
		c.add(10, 10);
		System.out.println("End of Add Method");	
		
		System.out.println("Calling Sub Method");
		c.sub(20, 10);
		System.out.println("End of Sub Method");
		
		System.out.println("Calling Div Method");
		c.div(10, 0);
		System.out.println("End of Div Method");
	}
}

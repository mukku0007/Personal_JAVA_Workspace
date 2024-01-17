package Programs;

public class Fun 
{
	public static void main(String[] args) 
	{
		Name("Mukesh Kumar\n");
		Print_Name("Rakesh Kumar",5);
		System.out.println(add(5));
	}
	
	public static void Name(String name)
	{
		System.out.println(name);
	}
	
	
	public static void Print_Name(String name, int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.println(name);
		}
	}
	
	public static int add(int x)
	{
		return x+5;
		
	}
}

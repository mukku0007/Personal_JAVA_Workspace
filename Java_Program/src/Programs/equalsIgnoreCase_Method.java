package Programs;

public class equalsIgnoreCase_Method 
{
	public static void main(String[] args) 
	{
		String str1 = "Hello";
		String str2 = "Hello";
		
		boolean isEqual = str1.equalsIgnoreCase(str2);
		
		System.out.println(isEqual);
	}
}

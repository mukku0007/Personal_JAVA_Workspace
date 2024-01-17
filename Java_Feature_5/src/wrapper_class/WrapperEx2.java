package wrapper_class;

public class WrapperEx2 
{
	public static void main(String[] args) 
	{
		int y; 					// Here y is primitive data type
		String str = "2000";	// Here String is a class and str is Object.
		
		y=Integer.parseInt(str);  // Here we convert Object into Primitive data type.
		System.out.println(y);
		
		//Here We can perform Increment
		
		y++;
		
		System.out.println(y);
	}
}

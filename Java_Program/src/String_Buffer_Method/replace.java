package String_Buffer_Method;

public class replace 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("BIBI");
		
		// The replace() method replaces the given String from the specified beginIndex and endIndex.
		sb.replace(1, 4, "A");
		
		System.out.println(sb);
	}
}

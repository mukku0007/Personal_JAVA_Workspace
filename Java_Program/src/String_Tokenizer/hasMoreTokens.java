package String_Tokenizer;

import java.util.StringTokenizer;

public class hasMoreTokens 
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("Hello World");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}

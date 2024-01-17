package String_Tokenizer;

import java.util.StringTokenizer;

public class hasMoreElement 
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("Welcome to JAVA Technology");
		
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
	}
}

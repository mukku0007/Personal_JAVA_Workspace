package command_line_argument;

public class Ex2 
{
	public static void main(String[] args) 
	{
		int x,y;
		
		x = Integer.parseInt(args[10]);
		y = Integer.parseInt(args[20]);
		
		System.out.println(x+y);
		
	}
}

//Run in cmd
//javac Command_Line_Argument.java
//java Command_Line_Argument  10 20

//Output:- 30
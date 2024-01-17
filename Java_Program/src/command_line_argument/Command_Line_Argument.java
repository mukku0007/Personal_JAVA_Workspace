package command_line_argument;

/*
 Command Line Argument:-
 						Command Line Argument means input given by the user at the run time of program
 						means user pass some values at the runtime.
*/

public class Command_Line_Argument 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}


// Run in cmd
// javac Command_Line_Argument.java
// java Command_Line_Argument  Hello Mukesh

// Output:- Hello Mukesh
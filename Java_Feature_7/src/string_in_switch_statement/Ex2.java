package string_in_switch_statement;

public class Ex2 
{
	public static void main(String[] args) 
	{
		String game = "CHESS";
		
		switch(game)
		{
			case "CRICKET": case "FOOTBALL": case "BASKETBALL":
				System.out.println("This is Outdoor Games.");
			break;
			
			case "LUDO": case "CARROM": case "CHESS":
				System.out.println("This is Indoor Games.");
			break;
			
			default:
				System.out.println("Which Types of game you want to Play");
		}
	}
}

package enum_keyword;

public class Ex1 
{
	public enum Season
	{
		WINTER,SPRING,SUMMER,RAIN;
	}
	
	public static void main(String[] args) 
	{
		for(Season s:Season.values())
		{
			System.out.println(s);
		}
	}
}

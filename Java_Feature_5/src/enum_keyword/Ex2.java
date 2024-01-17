package enum_keyword;

public class Ex2 
{
	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}  
	public static void main(String args[])
	{  
		Day day=Day.MONDAY;  
		switch(day)
		{  
			case SUNDAY:   
				System.out.println("Sunday");  
			break;  
			case MONDAY:   
				System.out.println("Monday");  
			break;  
			default:  
				System.out.println("Other Day");
		}		
	}  
}

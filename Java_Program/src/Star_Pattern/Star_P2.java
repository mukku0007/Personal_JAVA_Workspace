package Star_Pattern;

public class Star_P2 
{
	public static void main(String[] args) 
	{
		int size = 5;
		for(int row=1;row<size;row++)
		{
			for(int col=1;col<size;col++)
			{
				//Print Stars
				if(row == 1 || row == size-1 || col == 1 || col == size-1)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			
			System.out.println();
		}
	}
}

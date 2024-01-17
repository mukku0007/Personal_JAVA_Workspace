package foreachloop;

public class Ex2 
{
	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,10};
		int sum=0;
		
		for(int n:arr)
		{
			sum=sum+n;
		}
		
		System.out.println("Total Sum = " +sum);
	}
}

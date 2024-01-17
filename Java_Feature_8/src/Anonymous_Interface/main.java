package Anonymous_Interface;

public class main {

	public static void main(String args[])
	{
		Anonymous obj = new Anonymous() {
			
			public void show() {
				System.out.println("Anonymous");
			}
			
			public void printNum(int x) {
				System.out.println(x);
			}
		};
		
		obj.show();
		obj.printNum(44);
	}
}

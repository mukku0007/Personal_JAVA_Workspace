package Lambda_Expression;

public interface Without_Lambda_Exp {

	public static void main(String[] args) {

		int a = 10;
		Print obj = new Print() {

			public void show() {
				System.out.println(a);
			}
		};

		obj.show();
	}
}

package Lambda_Expression;

interface hello {
	public String say();
}

public class Lambda_Exp_With_Zero_Parameter {

	public static void main(String[] args) {
		hello s = () -> {
			return "I have nothing to say.";
		};
		System.out.println(s.say());
	}
}

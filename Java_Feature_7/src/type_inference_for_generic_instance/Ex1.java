package type_inference_for_generic_instance;

class GenericClass<X>
{
	<T> GenericClass (T t)
	{
		System.out.println(t);
	}
}

public class Ex1 
{
	public static void main(String[] args) 
	{
		GenericClass<String> gc = new GenericClass<>("Hello");
	}
}

package wrapper_class;

import java.util.ArrayList;

public class WrapperEx1 
{
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		Integer I = new Integer(10);
		l.add(I);
		System.out.println(l);
	}
}

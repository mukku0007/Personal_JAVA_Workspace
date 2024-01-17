package String_Buffer_Method;

public class Delete {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Mukesh");
		
		// The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex.
		sb.delete(3, 6);
		System.out.println(sb);
	}
}

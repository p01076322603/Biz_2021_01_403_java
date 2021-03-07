package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1 = "java";
		StringBuilder buffer = new StringBuilder(str1);
		
			System.out.println(System.identityHashCode(buffer)); // before append
			
		buffer.append(" and").append(" android").append(" kotlin");
		
			System.out.println(System.identityHashCode(buffer)); // after append
			
		String str2 = buffer.toString(); // toString() -> return String;
		
		System.out.println(buffer); // StringBuilder type
		System.out.println(str2); // String type
	}
}

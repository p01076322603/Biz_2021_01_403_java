package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass();
			System.out.println(pClass1.getName()); // package.class
		
			// 정적 로딩
			// 컴파일 시 해당 클래스가 로딩된다
		Class pClass2 = Person.class;
			System.out.println(pClass1.getName());
			
			// 동적 로딩
			// java.lang.String 클래스가 있다면 이부분에서 메모리 로딩시 가져올수 있다
			// 실행중에 데이터타입을 알고 binding 되는 방식
		Class pClass3 = Class.forName("java.lang.String");
			System.out.println(pClass3.getName());
		
	}
}

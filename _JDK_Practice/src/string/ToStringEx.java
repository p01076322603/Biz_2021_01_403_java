package string;

class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return title + "," + author;
	}
}

public class ToStringEx {

	public static void main(String[] args) {
	
		Book book = new Book("두잇자바", "은종님");
		
		System.out.println(book);
		
		String str = new String("Test");
		System.out.println(str);
	}
}

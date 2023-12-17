package chapter6;

public class Book {

	private String title;
	private Person author;
	
	public Book (Person author, String title) {
		this.title = title;
		this.author=author;
	}
	
	public String getTitle () {
		return title;
	}
	
	public Person getAuthor () {
		return author;
	}
	
}

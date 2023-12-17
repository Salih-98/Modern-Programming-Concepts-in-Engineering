package chapter6;
import java.util.*; //collection framework

public class Catalog {

	private ArrayList<Book> books = new ArrayList <Book>(); //we create an ArrayList of type Book 
															//to store books whose number can change 
	
	public void addBook (Book b) {
		books.add(b);
	}
	
	public void removeBook (Book b) {
		books.remove(b);
	}
	
	public void print () {
		for (int i=0; i<books.size(); i++) {
			Book b = books.get(i);
			System.out.println(b.getTitle()+" by " + b.getAuthor().getName());
		}
	}
	
}

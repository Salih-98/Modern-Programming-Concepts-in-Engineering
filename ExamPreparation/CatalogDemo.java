package ExamPreparation;

public class CatalogDemo {
	
public static void main (String [] arg) {	
	Catalog catalog = new Catalog ();
	
	Person author1 = new Person ("Herman Melville");
	Book book1 = new Book (author1, "Moby dick");
	Book book2 = new Book(author1, "Pierre");
	
	Person author2 = new Person ("Sylvia Plath");
	Book book3 = new Book(author2, "The Bell Jar");
	
	Person author3 = new Person ("Isaac B. Singer");
	Book book4 = new Book (author3, "Short Friday and Other Stories");
	
	catalog.addBook(book1);
	catalog.addBook(book2);
	catalog.addBook(book3);
	catalog.addBook(book4);
	
	System.out.println("The catalog contains: ");
	catalog.print();
	
	System.out.println("Now, we will remove some books." + "\n");
	
	catalog.removeBook(book2);
	catalog.print();
}
}

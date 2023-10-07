import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Book book1 = new Book("Beauty & the Beast", "king", "7741");
		Book book2 = new Book("Princess & the Frog", "Robert", "1243");
		Book book3 = new Book("Princess & the Frog", "Robert", "1243");
		Book.add_Book(book1);
		Book.add_Book(book2);
		Book.add_Book(book3);
		ArrayList <Book> bookCollection = Book.get_BookCollection();
		System.out.println("List of books:");
		for (Book book: bookCollection)
			System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
		Book.remove_Book(book1);
		System.out.println("After removeing " + book1.get_Title() + ", ISBN: " + book1.get_ISBN() + ":");
		for (Book book: bookCollection)
			System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
	}
}
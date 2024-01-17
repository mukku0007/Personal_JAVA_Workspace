package assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.Test;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;

public class AssertTrueWithNoMessage {

	@Test
	public void assertTrueWithNoMessage() {
		BookService bookService = new BookService();
		
		Book book1 = new Book("1","The Java", "James Gosling");
		bookService.addBook(book1);
		
		List<Book> listOfBooks = new BookService().books();
		
		assertTrue(listOfBooks.isEmpty()); //Here we check the listOfBooks is empty or not.
	}
}

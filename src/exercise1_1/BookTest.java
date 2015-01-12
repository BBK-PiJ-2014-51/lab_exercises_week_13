package exercise1_1;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class BookTest {
	Book book;
	
	@BeforeClass
	public void buildBook(){
		Book book = new Book("For Whom the Bell Tolls", "Ernest Hemingway");
	}
	
	@Test
	public void testGetAuthor() {
		assertEquals( "Ernest Hemingway", book.getAuthor());
	}
	
	@Test
	public void testGetTitle() {
		assertEquals("For Whom the Bell Tolls", book.getTitle());
	}

}

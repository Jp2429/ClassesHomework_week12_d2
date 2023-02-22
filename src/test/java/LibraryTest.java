import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book;
    private Library library;
    @Before

    public void before(){
        book=new Book("title1","author1","genre1");
        library=new Library(2);
        library.addBook(book);
    }
    @Test
    public void canGetBooksFromLibrary(){
        assertEquals(1,library.getBookCount());
    }
    @Test
    public void canAddBooksToLibrary(){
        library.addBook(book);
        assertEquals(2,library.getBookCount());
    }
    @Test
    public void canCheckCapacity(){
        boolean isFull=library.checkCapacity();
        assertEquals(true,isFull);
    }

}

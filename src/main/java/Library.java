import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private Integer capacity;

    public Library(Integer capacity){
        this.capacity=capacity;
        this.books=new ArrayList<Book>();
    }
    public void addBook(Book newBook){
        if(checkCapacity()){
            this.books.add(newBook);
        }
    }

    public int getBookCount() {
        return this.books.size();
    }

    public boolean checkCapacity() {
        if(this.books.size()<this.capacity){
            return true;
        }
        return false;
    }
}

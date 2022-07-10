package top.beif.designpattern.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 16116
 */
public class BookShelf implements Aggregate{

    private List<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }


    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

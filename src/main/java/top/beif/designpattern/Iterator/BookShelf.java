package top.beif.designpattern.Iterator;

/**
 * @author 16116
 */
public class BookShelf implements Aggregate{

    private Book[] books;
    private int last;

    public BookShelf(int maxsize) {
        books = new Book[maxsize];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    public Book getBookAt(int index) {
        return books[index];
    }


    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

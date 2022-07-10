package top.beif.designpattern.Iterator;

import org.junit.jupiter.api.Test;


/**
 * @author 16116
 */
class IteratorTest {

    @Test
    public void TestBook(){
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("张三的自我修养1"));
        bookShelf.appendBook(new Book("张三的自我修养2"));
        bookShelf.appendBook(new Book("张三的自我修养3"));
        bookShelf.appendBook(new Book("张三的自我修养4"));
        bookShelf.appendBook(new Book("张三的自我修养5"));
        bookShelf.appendBook(new Book("张三的自我修养6"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("book = " + book.getName());
        }

    }

}
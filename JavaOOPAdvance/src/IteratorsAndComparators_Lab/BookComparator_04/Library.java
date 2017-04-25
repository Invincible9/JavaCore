package IteratorsAndComparators_Lab.BookComparator_04;

import java.util.Iterator;

/**
 * Created by Mihail on 3/21/2017.
 */
public class Library<Book> implements Iterable<Book> {

    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }

    private final class LibraryIterator implements Iterator<Book> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            if (this.counter < books.length) {
                return true;
            }
            return false;
        }

        @Override
        public Book next() {
            counter++;
            return books[counter - 1];
        }
    }

}

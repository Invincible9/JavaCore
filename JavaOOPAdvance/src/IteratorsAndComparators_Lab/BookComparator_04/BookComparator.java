package IteratorsAndComparators_Lab.BookComparator_04;

import java.util.Comparator;

/**
 * Created by Mihail on 3/21/2017.
 */
public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book first, Book second) {
        if (first.getTitle().compareTo(second.getTitle()) == 0) {
            if (first.getYear() > second.getYear()) {
                return 1;
            } else if (first.getYear() < second.getYear()) {
                return -1;
            }
            return 0;
        } else {
            return first.getTitle().compareTo(second.getTitle());
        }

    }

}
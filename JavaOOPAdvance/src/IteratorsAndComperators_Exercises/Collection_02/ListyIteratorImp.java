package IteratorsAndComperators_Exercises.Collection_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by Mihail on 3/22/2017.
 */
public class ListyIteratorImp implements Iterable<String> {

    private List<String> list;
    private int currentEl;

    public ListyIteratorImp() {
        this.list = new ArrayList<>();
        this.currentEl = 0;
    }

    @Override
    public Iterator<String> iterator() {
        return new ListyIterator();
    }

    boolean Move() {
        if (this.iterator().hasNext()) {
            this.currentEl++;
            return true;
        } else {
            return false;
        }
    }

    void Create(String element) {
        this.list.add(element);
    }

    void Print() {
        if (this.list.isEmpty()) {
            throw new IllegalArgumentException("Invalid Operation!");
        } else {
            System.out.println(this.list.get(this.currentEl));
        }
    }

    void PrintALl() {
        System.out.println(String.join(" ", this.list));
    }

    private class ListyIterator implements Iterator<String> {

        @Override
        public boolean hasNext() {
            if (currentEl + 1 < list.size()) {
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            return list.get(currentEl++);
        }

    }
}

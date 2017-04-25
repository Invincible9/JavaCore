package IteratorsAndComperators_Exercises.ListyIterator_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Mihail on 3/22/2017.
 */
public class ListyIterator implements Iterator<String> {
    private List<String> list;

    private int currentEl = 0;

    public ListyIterator() {
        this.list = new ArrayList<>();
    }

    boolean Move() {
        if (this.currentEl + 1 < this.list.size()) {
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

    @Override
    public boolean hasNext() {
        if (this.currentEl + 1 < this.list.size()) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        return this.list.get(this.currentEl++);
    }
}

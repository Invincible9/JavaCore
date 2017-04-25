package Generics_Exercises.GenericCountMethodIntegers_06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/17/2017.
 */
public class Box<T extends Comparable> {
    private List<T> list;
    private static final int COUNT = 0;

    public Box() {
        this.list = new ArrayList<T>();
    }

    public void addElement(T element) {
        this.list.add(element);
    }

    public <T extends Comparable> int compare(T element) {
        int count = COUNT;

        for (int i = 0; i < this.list.size(); i++) {
            if (element.compareTo(this.list.get(i)) < 0) {
                count++;
            }
        }

        return count;
    }

}

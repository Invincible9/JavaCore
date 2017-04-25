package Generics_Exercises.CustomListSorted_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mihail on 3/17/2017.
 */
public class CustomList<T extends Comparable<T>> {
    private List<T> list;
    private static final int COUNT = 0;

    public CustomList() {
        this.list = new ArrayList<T>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public T remove(int index) {
        return this.list.remove(index);
    }

    public boolean contains(T element) {
        return this.list.contains(element);
    }

    public void swap(int index1, int index2) {
        T temp = this.list.get(index1);
        this.list.set(index1, this.list.get(index2));
        this.list.set(index2, temp);
    }

    public int countGreaterThat(T element) {
        int count = COUNT;

        for (int i = 0; i < this.list.size(); i++) {
            if (element.compareTo(this.list.get(i)) < 0) {
                ++count;
            }
        }
        return count;
    }

    public T getMax() {
//        T maxEL = this.list.get(0);
//
//        for (int i = 1; i < this.list.size(); i++) {
//            if (maxEL.compareTo(this.list.get(i)) < 0) {
//                maxEL = this.list.get(i);
//            }
//        }
        return Collections.max(this.list, null);
    }

    public T getMin() {

//        T minEl = this.list.get(0);
//
//        for (int i = 1; i < this.list.size(); i++) {
//            if (minEl.compareTo(this.list.get(i)) > 0) {
//                minEl = this.list.get(i);
//            }
//        }
        return Collections.min(this.list, null);
    }

    public void sort(){
        Collections.sort(this.list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T t : this.list) {
            sb.append(t).append("\n");
        }
        return sb.toString().trim();
    }

}

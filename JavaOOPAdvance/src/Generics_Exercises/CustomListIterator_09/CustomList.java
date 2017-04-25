package Generics_Exercises.CustomListIterator_09;

import java.util.*;

/**
 * Created by Mihail on 3/17/2017.
 */
public class CustomList<E extends Comparable<E>> {
    private List<E> list;
    private static final int COUNT = 0;

    public CustomList() {
        this.list = new ArrayList<E>();
    }

    public void add(E element) {
        this.list.add(element);
    }

    public E remove(int index) {
        return this.list.remove(index);
    }

    public boolean contains(E element) {
        return this.list.contains(element);
    }

    public void swap(int index1, int index2) {
        E temp = this.list.get(index1);
        this.list.set(index1, this.list.get(index2));
        this.list.set(index2, temp);
    }

    public <E extends Comparable> int countGreaterThat(E element) {
        int count = COUNT;

        for (int i = 0; i < this.list.size(); i++) {
            if (element.compareTo(this.list.get(i)) < 0) {
                ++count;
            }
        }
        return count;
    }

    public E getMax() {
//        T maxEL = this.list.get(0);
//
//        for (int i = 1; i < this.list.size(); i++) {
//            if (maxEL.compareTo(this.list.get(i)) < 0) {
//                maxEL = this.list.get(i);
//            }
//        }
        return Collections.max(this.list, null);
    }

    public E getMin() {

//        T minEl = this.list.get(0);
//
//        for (int i = 1; i < this.list.size(); i++) {
//            if (minEl.compareTo(this.list.get(i)) > 0) {
//                minEl = this.list.get(i);
//            }
//        }
        return Collections.min(this.list, null);
    }

    public void sort() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(list.size() - 1 - i));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Iterator<E> it = this.list.iterator();

        while (it.hasNext()) {
            sb.append(it.next()).append("\n");
        }
        return sb.toString().trim();
    }


}

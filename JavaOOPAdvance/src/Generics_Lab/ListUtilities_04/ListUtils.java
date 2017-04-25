package Generics_Lab.ListUtilities_04;

import java.util.List;

/**
 * Created by Mihail on 3/16/2017.
 */
public class ListUtils<T> {

    public static <T extends Comparable<T>> T getMin(List<T> list) {

        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        T minEl = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (minEl.compareTo(list.get(i)) > 0) {
                minEl = list.get(i);
            }
        }
        return minEl;
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        T maxEl = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (maxEl.compareTo(list.get(i)) < 0) {
                maxEl = list.get(i);
            }
        }
        return maxEl;
    }

}

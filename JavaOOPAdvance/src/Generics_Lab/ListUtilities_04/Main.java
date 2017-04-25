package Generics_Lab.ListUtilities_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 3, 25, 27, 77, 13131);

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", "b", "c");

        System.out.println(ListUtils.getMin(integers));
        System.out.println(ListUtils.getMax(integers));
        System.out.println(ListUtils.getMin(strings));
        System.out.println(ListUtils.getMax(strings));

    }
}

package Generics_Lab.NullFinder_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 3, null, 3, 4, null);

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", "1","3", null, "b", "c", "7", null);

        System.out.println(ListUtils.getNullIndices(integers));
        System.out.println(ListUtils.getNullIndices(strings));

    }
}

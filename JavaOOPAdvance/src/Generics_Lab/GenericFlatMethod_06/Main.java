package Generics_Lab.GenericFlatMethod_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 3);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 1.0, 7.0);

        List<List<? extends Number>> jagged = new ArrayList<>();
        Collections.addAll(jagged, integers, doubles);

        List<Number> dest = new ArrayList<>();
        ListUtils.flatten(dest, jagged);

    }
}

package Generics_Lab.GenericAddAllMethod_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 1, 2, 3);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 1.0, 7.0, 1214315166.0);

        List<? super Number> dest = new ArrayList<>();

        ListUtils.addAll(dest, integerList);
        ListUtils.addAll(dest, doubles);

        System.out.println(dest);
    }
}

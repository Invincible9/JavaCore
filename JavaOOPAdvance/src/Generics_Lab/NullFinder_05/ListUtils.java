package Generics_Lab.NullFinder_05;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/16/2017.
 */
public class ListUtils<T> {

    public static <T> List<Integer> getNullIndices(List<T> list) {
        List<Integer> position = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                position.add(i);
            }
        }
        return position;
    }

}

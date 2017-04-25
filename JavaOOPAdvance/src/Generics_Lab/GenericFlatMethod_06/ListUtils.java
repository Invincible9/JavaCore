package Generics_Lab.GenericFlatMethod_06;

import java.util.List;

/**
 * Created by Mihail on 3/16/2017.
 */
public class ListUtils<T> {

    public static <T> void flatten(List<? super T> dest, List<List<? extends T>> src) {
        for (List<? extends T> list : src) {
            dest.addAll(list);
        }
    }

}

package Generics_Lab.GenericAddAllMethod_07;

import java.util.List;

/**
 * Created by Mihail on 3/16/2017.
 */
public class ListUtils {

    public static <T> void addAll(List<? super T> destination, List<? extends T> source){
        for (T elements : source) {
            destination.add(elements);
        }
    }
}

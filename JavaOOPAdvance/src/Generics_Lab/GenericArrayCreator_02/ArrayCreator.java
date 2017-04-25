package Generics_Lab.GenericArrayCreator_02;

import java.lang.reflect.Array;


/**
 * Created by Mihail on 3/16/2017.
 */
public class ArrayCreator<T> {

    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) new Object[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }

    public static <T> T[] create(Class<T> cl, int length, T item) {
        T[] array = (T[]) Array.newInstance(cl, length);
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }

}

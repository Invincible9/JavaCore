package Generics_Lab.GenericArrayCreator_02;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) {

        String[] strings = ArrayCreator.create(10, "none");
        Integer[] integers = ArrayCreator.create(Integer.class, 10, 0);

    }
}

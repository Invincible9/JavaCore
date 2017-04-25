package OpenClosedAndLiskovPrinciple_Lab.P01_ExtendedArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 4/4/2017.
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ExtendedArrayList<Integer> list = new ExtendedArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.max());
        System.out.println(list.min());
    }
}

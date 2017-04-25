package Generics_Exercises.GenericSwapMethodStrings_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/17/2017.
 */
public class Box<T> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<T>();
    }

    public void addElement(T element) {
        this.list.add(element);
    }

    public void swapElements(int firstIndex, int secondIndex) {
        T temp = this.list.get(firstIndex);
        this.list.set(firstIndex, this.list.get(secondIndex));
        this.list.set(secondIndex, temp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T t : list) {
            sb.append(t.getClass().getName() + ": " + t + "\n");
        }

        return sb.toString();
    }
}

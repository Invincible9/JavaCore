package Generics_Lab.GenericScale_03;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Scale<T extends Comparable> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        if (this.left.compareTo(this.right) < 0) {
            return this.right;
        }

        if (this.left.compareTo(this.right) > 0) {
            return this.left;
        }
        return null;
    }

}

package Generics_Exercises.Tuple_10;

/**
 * Created by Mihail on 3/18/2017.
 */
public class Tuple<E> {

    private E key;
    private E value;

    public Tuple(E key, E value) {
        this.setKey(key);
        this.setValue(value);
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.getKey() + " -> " + this.getValue();
    }

}

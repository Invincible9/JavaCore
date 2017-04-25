package Generics_Exercises.Threeuple_11;

/**
 * Created by Mihail on 3/18/2017.
 */
public class Tuple<E> {

    private E key;
    private E value;
    private E element;

    public Tuple(E key, E value, E element) {
        this.setKey(key);
        this.setValue(value);
        this.setElement(element);
    }

    public E getKey() {
        return key;
    }

    private void setKey(E key) {
        this.key = key;
    }

    public E getValue() {
        return value;
    }

    private void setValue(E value) {
        this.value = value;
    }

    public E getElement() {
        return element;
    }

    private void setElement(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return this.getKey() + " -> " + this.getValue() + " -> " + this.getElement();
    }

}

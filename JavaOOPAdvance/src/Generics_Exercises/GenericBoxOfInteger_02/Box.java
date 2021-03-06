package Generics_Exercises.GenericBoxOfInteger_02;

/**
 * Created by Mihail on 3/17/2017.
 */
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return (value.getClass().getName() + ": " + value);
    }
}

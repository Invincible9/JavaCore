package Inheritance_Lab_Lection_06.StackOfStrings_06;

/**
 * Created by Mihail on 2/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        StackOfStrings stackOfStrings = new StackOfStrings();

        stackOfStrings.push("Pesho");
        stackOfStrings.push("Gosho");
        stackOfStrings.push("Mimi");

        System.out.println(stackOfStrings.peek());
        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.isEmpty());
    }
}

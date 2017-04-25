package Generics_Lab.GenericScale_03;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scale<String> scale = new Scale<>("a", "c");
        System.out.println(scale.getHeavier());

        Scale<Integer> integerScale = new Scale<>(1, 7);
        System.out.println(integerScale.getHeavier());
    }
}

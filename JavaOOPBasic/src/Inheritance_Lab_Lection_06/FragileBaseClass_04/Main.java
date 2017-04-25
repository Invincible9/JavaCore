package Inheritance_Lab_Lection_06.FragileBaseClass_04;

/**
 * Created by Mihail on 2/28/2017.
 */
public class Main {

    public static void main(String[] args) {
        Predator predator = new Predator();
        predator.eatAll(new Food[] {new Food(), new Food()});
        predator.feed(new Food());

    }
}

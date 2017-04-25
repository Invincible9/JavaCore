package Inheritance_Lab_Lection_06.RandomArrayList_05;

/**
 * Created by Mihail on 2/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        RandomArrayList randomArrayList = new RandomArrayList();

        randomArrayList.add(1);
        randomArrayList.add("Gosho");
        randomArrayList.add(2);
        randomArrayList.add(new RandomArrayList());


        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
    }
}

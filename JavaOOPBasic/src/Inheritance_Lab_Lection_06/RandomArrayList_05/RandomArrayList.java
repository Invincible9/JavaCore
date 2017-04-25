package Inheritance_Lab_Lection_06.RandomArrayList_05;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Mihail on 2/28/2017.
 */
public class RandomArrayList extends ArrayList {

    private Random rnd;

    public RandomArrayList(){
        rnd = new Random();
    }

    public Object getRandomElement() {

        int index = rnd.nextInt(super.size());
        Object element = super.get(index);
        super.set(index, super.get(super.size() -1));
        super.remove(super.size()-1);

        return element;
    }


}

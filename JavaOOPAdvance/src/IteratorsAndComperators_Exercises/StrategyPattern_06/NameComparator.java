package IteratorsAndComperators_Exercises.StrategyPattern_06;

import java.util.Comparator;

/**
 * Created by Mihail on 3/26/2017.
 */
public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        Integer compareValue = Integer.compare(o1.getName().length(), o2.getName().length());

        if (compareValue == 0) {
            return Character.compare(o1.getName().toLowerCase().charAt(0), o2.getName().toLowerCase().charAt(0));
        }
        return compareValue;
    }
}

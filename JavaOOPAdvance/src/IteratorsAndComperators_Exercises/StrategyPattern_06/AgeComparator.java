package IteratorsAndComperators_Exercises.StrategyPattern_06;

import java.util.Comparator;

/**
 * Created by Mihail on 3/26/2017.
 */
public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }

}

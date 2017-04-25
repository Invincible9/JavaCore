package IteratorsAndComperators_Exercises.EqualityLogic_07;

import java.util.Comparator;

/**
 * Created by Mihail on 3/26/2017.
 */
public class AgeComparator implements Comparator<Person> {

    public AgeComparator(){

    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}

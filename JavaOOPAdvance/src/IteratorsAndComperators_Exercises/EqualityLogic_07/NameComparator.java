package IteratorsAndComperators_Exercises.EqualityLogic_07;

import java.util.Comparator;

/**
 * Created by Mihail on 3/26/2017.
 */
public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().compareTo(o2.getName()) == 0) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return o1.getName().compareTo(o2.getName());
    }
}

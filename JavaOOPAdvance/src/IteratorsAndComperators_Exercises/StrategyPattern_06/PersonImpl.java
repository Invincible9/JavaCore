package IteratorsAndComperators_Exercises.StrategyPattern_06;

/**
 * Created by Mihail on 3/26/2017.
 */
public class PersonImpl implements Person {

    private String name;
    private int age;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAge();
    }
}

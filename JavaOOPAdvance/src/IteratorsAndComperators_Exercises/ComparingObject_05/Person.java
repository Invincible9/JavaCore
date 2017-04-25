package IteratorsAndComperators_Exercises.ComparingObject_05;

/**
 * Created by Mihail on 3/25/2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    private void setTown(String town) {
        this.town = town;
    }


    @Override
    public int compareTo(Person o) {

        if (this.getName().compareTo(o.getName()) == 0) {
            if (this.getAge() > o.getAge()) {
                return this.getTown().compareTo(o.getTown());
            }
            return Integer.compare(this.getAge(), o.getAge());
        }
        return this.getName().compareTo(o.getName());
    }
}

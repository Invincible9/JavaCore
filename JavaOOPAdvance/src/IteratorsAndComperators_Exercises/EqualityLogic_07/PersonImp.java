package IteratorsAndComperators_Exercises.EqualityLogic_07;

/**
 * Created by Mihail on 3/26/2017.
 */
public class PersonImp implements Person{
    private String name;
    private Integer age;

    public PersonImp(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return !(obj == null || obj.getClass() != this.getClass())
                && person.getName().equals(this.getName())
                && person.getAge() == (this.getAge());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() * this.age.hashCode();
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

}

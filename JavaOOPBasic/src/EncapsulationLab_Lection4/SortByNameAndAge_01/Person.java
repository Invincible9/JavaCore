package EncapsulationLab_Lection4.SortByNameAndAge_01;

/**
 * Created by Mihail on 2/23/2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //Asen Harizanoov is a 44 yaers old.
    @Override
    public String toString() {
        return String.format("%s %s is a %d years old.", this.getFirstName(), this.getLastName(), this.getAge());
    }
}

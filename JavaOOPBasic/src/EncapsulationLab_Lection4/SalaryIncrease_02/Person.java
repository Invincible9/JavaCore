package EncapsulationLab_Lection4.SalaryIncrease_02;

/**
 * Created by Mihail on 2/23/2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;

    public Person(String firstName, String lastName, Integer age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(Double bonus) {
        if (this.getAge() > 30) {
            this.salary += this.getSalary() * bonus / 100;
        } else {
            this.salary += this.getSalary() * bonus / 200;
        }
    }

    //Asen Harizanoov is a 44 yaers old.
    @Override
    public String toString() {
        return String.format("%s %s get ", this.getFirstName(), this.getLastName()) + this.getSalary() + " leva";
    }
}

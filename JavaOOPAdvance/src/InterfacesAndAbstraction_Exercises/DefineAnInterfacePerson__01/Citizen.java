package InterfacesAndAbstraction_Exercises.DefineAnInterfacePerson__01;

/**
 * Created by Mihail on 3/15/2017.
 */
public class Citizen implements Person {
    private String name;
    private int age;

    public Citizen(String name, int age) {
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
}

package InterfacesAndAbstraction_Exercises.MultipleImplementation_02;

/**
 * Created by Mihail on 3/15/2017.
 */
public class Citizen implements Identifiable, Birthable {

    private String name;
    private int age;
    private String Id;
    private String birthdate;

    protected Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.Id = id;
        this.birthdate = birthdate;
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
    public String getBirthdate() {
        return this.birthdate;
    }

    @Override
    public String getId() {
        return this.Id;
    }
}

package InterfacesAndAbstraction_Exercises.BirthdayCelebrations_06;

/**
 * Created by Mihail on 3/15/2017.
 */
public class Citizens implements Soldier, BirthDate {

    private String name;
    private int age;
    private String Id;
    private String birthdate;

    public Citizens(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.Id = id;
        this.birthdate = birthdate;
    }

    @Override
    public String getId() {
        return this.Id;
    }


    @Override
    public String getBirthDate() {
        return this.birthdate;
    }
}

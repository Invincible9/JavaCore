package InterfacesAndAbstraction_Exercises.BirthdayCelebrations_06;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Pet implements BirthDate {

    private String name;
    private String birthdate;

    public Pet(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    @Override
    public String getBirthDate() {
        return this.birthdate;
    }
}

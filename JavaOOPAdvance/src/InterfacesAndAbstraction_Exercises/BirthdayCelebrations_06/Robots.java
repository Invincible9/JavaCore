package InterfacesAndAbstraction_Exercises.BirthdayCelebrations_06;

/**
 * Created by Mihail on 3/15/2017.
 */
public class Robots implements Soldier {
    private String model;
    private String Id;

    protected Robots(String model, String id) {
        this.model = model;
        this.Id = id;
    }

    @Override
    public String getId() {
        return this.Id;
    }

}

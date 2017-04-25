package InterfacesAndAbstraction_Exercises.BorderControl_05;

/**
 * Created by Mihail on 3/15/2017.
 */
public class Citizens implements Soldier{

    private String name;
    private int age;
    private String Id;

    public Citizens(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.Id = id;
    }

    @Override
    public String getId() {
        return this.Id;
    }

}

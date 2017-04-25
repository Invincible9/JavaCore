package InterfacesAndAbstraction_Exercises.FoodShortage_07;

/**
 * Created by Mihail on 3/15/2017.
 */
public class Citizens implements Soldier, BirthDate, Buyer {

    private String name;
    private int age;
    private String Id;
    private String birthdate;
    private Integer food;

    public Citizens(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.Id = id;
        this.birthdate = birthdate;
        this.food = 0;
    }

    @Override
    public String getId() {
        return this.Id;
    }


    @Override
    public String getBirthDate() {
        return this.birthdate;
    }

    @Override
    public void BuyFood() {
        this.food = this.getFood() + 10;
    }

    @Override
    public Integer getFood() {
        return this.food;
    }
}

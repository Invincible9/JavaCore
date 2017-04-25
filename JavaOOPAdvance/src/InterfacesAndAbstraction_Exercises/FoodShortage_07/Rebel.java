package InterfacesAndAbstraction_Exercises.FoodShortage_07;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Rebel implements Buyer {
    private String name;
    private int age;
    private String group;
    private Integer food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    @Override
    public void BuyFood() {
        this.food = this.getFood() + 5;
    }

    @Override
    public Integer getFood() {
        return this.food;
    }


}

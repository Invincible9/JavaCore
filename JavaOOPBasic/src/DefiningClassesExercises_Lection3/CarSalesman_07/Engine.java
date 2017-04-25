package DefiningClassesExercises_Lection3.CarSalesman_07;

/**
 * Created by Mihail on 2/28/2017.
 */
public class Engine {
    private String model;
    private String power;
    private String displacement;
    private String efficiency;

    public Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, String power) {
        this(model, power, "n/a", "n/a");
    }

    public Engine(String model, String power, int displacement) {
        this(model, power, displacement + "", "n/a");
    }

    public Engine(String model, String power, String efficiency) {
        this(model, power, "n/a", efficiency);
    }

    public String getModel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }


}

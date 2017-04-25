package InterfacesAndAbstraction_Exercises.Ferrari_03;

/**
 * Created by Mihail on 3/15/2017.
 */
public class Ferrari implements Car {
    private String model;
    private String name;

    public Ferrari(String name) {
        this.setName(name);
        this.model = "488-Spider";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gasPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", this.model, this.brakes(), this.gasPedal(), this.name);
    }
}

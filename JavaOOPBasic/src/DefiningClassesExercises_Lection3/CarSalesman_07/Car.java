package DefiningClassesExercises_Lection3.CarSalesman_07;

/**
 * Created by Mihail on 2/28/2017.
 */
public class Car {
    private String carModel;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String carModel, Engine engine, String weight, String color) {
        this.carModel = carModel;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String carModel, Engine engine) {
        this(carModel, engine, "n/a", "n/a");
    }

    public Car(String carModel, Engine engine, int weight) {
        this(carModel, engine, weight + "", "n/a");
    }

    public Car(String carModel, Engine engine, String color) {
        this(carModel, engine, "n/a", color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.carModel).append(":\n  ");
        sb.append(this.engine.getModel()).append(":\n    ");
        sb.append("Power").append(": ").append(this.engine.getPower()).append("\n    ");
        sb.append("Displacement").append(": ").append(this.engine.getDisplacement()).append("\n    ");
        sb.append("Efficiency").append(": ").append(this.engine.getEfficiency()).append("\n  ");
        sb.append("Weight: ").append(this.weight).append("\n  ");
        sb.append("Color: ").append(this.color);
        return sb.toString();
    }

}

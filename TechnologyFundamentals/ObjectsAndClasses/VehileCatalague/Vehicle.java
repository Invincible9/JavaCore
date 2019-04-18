package ObjectsAndClasses.VehileCatalague;

import java.util.List;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private Integer horsePower;

    public Vehicle(){ }

    public Vehicle(String type, String model, String color, Integer horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return color;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public static Double averageHorsePower(List<Vehicle> vehicles){

        if(vehicles.size() == 0){
            return 0.0;
        }
        double sum = 0;

        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getHorsePower();
        }

        return sum / vehicles.size();
    }

    @Override
    public String toString() {
        return String.format("Type: %s\n" +
                        "Model: %s\n" +
                        "Color: %s\n" +
                        "Horsepower: %d",
                this.getType().toUpperCase().charAt(0) +
                this.getType().substring(1),
                this.getModel(),
                this.getColor(),
                this.getHorsePower()
        );
    }
}

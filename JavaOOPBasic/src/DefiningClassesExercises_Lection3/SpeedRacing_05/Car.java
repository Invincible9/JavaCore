package DefiningClassesExercises_Lection3.SpeedRacing_05;

/**
 * Created by Mihail on 2/26/2017.
 */
public class Car {
    private String model;
    private Double fuelAmount;
    private Double fuelCostFor1km;
    private int distanceTraveled;

    public Car(String model, Double fuelAmount, Double fuelCostFor1km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1km = fuelCostFor1km;
        this.distanceTraveled = 0;
    }

    public String getModel() {
        return model;
    }

    public Double getFuelAmount() {
        return fuelAmount;
    }

    public Double getFuelCostFor1km() {
        return fuelCostFor1km;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void calculateFuelForDrive(int amountOfKm) {
        if (amountOfKm * this.fuelCostFor1km <= this.fuelAmount) {
            this.distanceTraveled += amountOfKm;
            this.fuelAmount -= amountOfKm * this.fuelCostFor1km;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }


}

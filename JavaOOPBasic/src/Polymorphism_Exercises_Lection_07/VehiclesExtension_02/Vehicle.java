package Polymorphism_Exercises_Lection_07.VehiclesExtension_02;

import java.text.DecimalFormat;

/**
 * Created by Mihail on 3/7/2017.
 */
public class Vehicle {
    private Double fuelQuantity;
    private Double fuelConsumptionInLitersPerKm;
    private Double tankCapacity;

    public Vehicle(Double fuelQuantity, Double fuelConsumptionInLitersPerKm, Double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumptionInLitersPerKm(fuelConsumptionInLitersPerKm);
        this.setTankCapacity(tankCapacity);
    }

    public Double getFuelQuantity() {
        return this.fuelQuantity;
    }

    protected void setFuelQuantity(Double fuelQuantity) {
        if(fuelQuantity <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        this.fuelQuantity = fuelQuantity;
    }

    public Double getFuelConsumptionInLitersPerKm() {
        return this.fuelConsumptionInLitersPerKm;
    }

    public Double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(Double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    protected void setFuelConsumptionInLitersPerKm(Double fuelConsumptionInLitersPerKm) {
        this.fuelConsumptionInLitersPerKm = fuelConsumptionInLitersPerKm;
    }

    public void driveEmptyDistance(Double distance){
    }

    public void drivenGivenDistance(Double distance) {

        if (this.getFuelQuantity() <= distance * this.getFuelConsumptionInLitersPerKm()) {
            throw new IllegalArgumentException("Bus need refueling");
        } else {
            this.setFuelQuantity(this.getFuelQuantity() - (distance * this.getFuelConsumptionInLitersPerKm()));
            DecimalFormat decimal = new DecimalFormat("#.#########################");
            throw new IllegalArgumentException("Bus travelled " + decimal.format(distance) + " km");
        }
    }

    public void refueledWithGivenLiters(Double liters) {
        this.setFuelQuantity(this.getFuelQuantity() + liters);
    }


}

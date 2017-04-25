package Polymorphism_Exercises_Lection_07.VehiclesExtension_02;

import java.text.DecimalFormat;

/**
 * Created by Mihail on 3/7/2017.
 */
public class Car extends Vehicle {


    public Car(Double fuelQuantity, Double fuelConsumptionInLitersPerKm, Double tankCapacity) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm, tankCapacity);
    }

    @Override
    public void drivenGivenDistance(Double distance) {

        if (super.getFuelQuantity() <= distance * (super.getFuelConsumptionInLitersPerKm() + 0.9)) {
            throw new IllegalArgumentException("Car needs refueling");
        } else {
            super.setFuelQuantity(super.getFuelQuantity() - (distance * (super.getFuelConsumptionInLitersPerKm() + 0.9)));
            DecimalFormat decimal = new DecimalFormat("#.#########################");
            throw new IllegalArgumentException("Car travelled " + decimal.format(distance) + " km");
        }
    }

    @Override
    public void refueledWithGivenLiters(Double liters) {
        if (super.getTankCapacity() < liters) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }else {
            super.setFuelQuantity(super.getFuelQuantity() + liters);
        }
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", super.getFuelQuantity());
    }
}

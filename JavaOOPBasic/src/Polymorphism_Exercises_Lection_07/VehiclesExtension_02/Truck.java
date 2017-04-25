package Polymorphism_Exercises_Lection_07.VehiclesExtension_02;

import java.text.DecimalFormat;

/**
 * Created by Mihail on 3/7/2017.
 */

public class Truck extends Vehicle {


    public Truck(Double fuelQuantity, Double fuelConsumptionInLitersPerKm, Double tankCapacity) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm, tankCapacity);
    }

    @Override
    public void drivenGivenDistance(Double distance) {

        if (super.getFuelQuantity() <= distance * (super.getFuelConsumptionInLitersPerKm() + 1.6)) {
            throw new IllegalArgumentException("Truck needs refueling");
        } else {
            super.setFuelQuantity(super.getFuelQuantity() - (distance * (super.getFuelConsumptionInLitersPerKm() + 1.6)));
            DecimalFormat decimal = new DecimalFormat("#.#########################");
            throw new IllegalArgumentException("Truck travelled " + decimal.format(distance) + " km");
        }
    }

    public void refueledWithGivenLiters(Double liters) {
        super.setFuelQuantity((super.getFuelQuantity() + liters) - liters * 0.05);
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", super.getFuelQuantity());
    }

}

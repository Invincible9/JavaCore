package Polymorphism_Exercises_Lection_07.VehiclesExtension_02;

import java.text.DecimalFormat;

/**
 * Created by Mihail on 3/7/2017.
 */
public class Bus extends Vehicle {

    public Bus(Double fuelQuantity, Double fuelConsumptionInLitersPerKm, Double tankCapacity) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm, tankCapacity);
    }

    @Override
    public void refueledWithGivenLiters(Double liters) {
        if (super.getTankCapacity() < liters) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.setFuelQuantity(super.getFuelQuantity() + liters);

    }

    @Override
    public void drivenGivenDistance(Double distance) {
        if (this.getFuelQuantity() <= distance * (this.getFuelConsumptionInLitersPerKm() + 1.4)) {
            throw new IllegalArgumentException("Bus needs refueling");
        } else {
            this.setFuelQuantity(this.getFuelQuantity() - (distance * (this.getFuelConsumptionInLitersPerKm() + 1.4)));
            DecimalFormat decimal = new DecimalFormat("#.#########################");
            throw new IllegalArgumentException("Bus travelled " + decimal.format(distance) + " km");
        }
    }

    @Override
    public void driveEmptyDistance(Double distance) {
        if (this.getFuelQuantity() <= distance * (this.getFuelConsumptionInLitersPerKm())) {
            throw new IllegalArgumentException("Bus needs refueling");
        } else {
            this.setFuelQuantity(this.getFuelQuantity() - (distance * (this.getFuelConsumptionInLitersPerKm())));
            DecimalFormat decimal = new DecimalFormat("#.#########################");
            throw new IllegalArgumentException("Bus travelled " + decimal.format(distance) + " km");
        }
    }

    @Override
    public String toString() {
        return String.format("Bus: %.2f", super.getFuelQuantity());
    }
}

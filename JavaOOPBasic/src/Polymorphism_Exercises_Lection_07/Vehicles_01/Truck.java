package Polymorphism_Exercises_Lection_07.Vehicles_01;

import java.text.DecimalFormat;

/**
 * Created by Mihail on 3/6/2017.
 */
public class Truck extends Vehicle {


    public Truck(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm);
    }

    @Override
    public void driveDistance(double distance) {
        double fuelQuantity = (this.getLitersPerKm() + 1.6) * distance;

        if (fuelQuantity > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Truck needs refueling");
        } else {
            this.setFuelQuantity(super.getFuelQuantity() - fuelQuantity);
            DecimalFormat df = new DecimalFormat("#.#########################");
            System.out.println("Truck" + " travelled " + df.format(distance) + " km");
        }
    }

    @Override
    public void refueledWithGivenLiters(double liters) {
//        double quantityTruck = liters * 0.95;
        super.setFuelQuantity((super.getFuelQuantity() + liters) - liters * 0.05);
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", super.getFuelQuantity());
    }

}

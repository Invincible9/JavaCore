package Polymorphism_Exercises_Lection_07.Vehicles_01;

import java.text.DecimalFormat;

/**
 * Created by Mihail on 3/2/2017.
 */
public class Car extends Vehicle {

    public Car(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm);
    }

    @Override
    public void driveDistance(double distance){
        double fuelQuantity = (this.getLitersPerKm() + 0.9) * distance;

        if(fuelQuantity > this.getFuelQuantity()){
            throw new IllegalArgumentException("Car needs refueling");
        }else{
            this.setFuelQuantity(super.getFuelQuantity() - fuelQuantity);
            DecimalFormat df = new DecimalFormat("#.#########################");
            System.out.println("Car" + " travelled " + df.format(distance) + " km");
        }
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", super.getFuelQuantity());
    }
}

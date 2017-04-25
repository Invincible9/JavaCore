package Polymorphism_Exercises_Lection_07.Vehicles_01;

/**
 * Created by Mihail on 3/6/2017.
 */
public class Vehicle {

    private double fuelQuantity;
    private double litersPerKm;

    public Vehicle(double fuelQuantity, double litersPerKm) {
        this.setFuelQuantity(fuelQuantity);
        this.setLitersPerKm(litersPerKm);
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public double getLitersPerKm() {
        return this.litersPerKm;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setLitersPerKm(double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    public void driveDistance(double distance){
        if((this.litersPerKm * distance) > this.fuelQuantity){
            throw new IllegalArgumentException("Vehicle needs refueling");
        }else{
            this.fuelQuantity -= (this.litersPerKm * distance);
        }
    }

    public void refueledWithGivenLiters(double fuelQuantity){
        this.fuelQuantity += fuelQuantity;
    }

}

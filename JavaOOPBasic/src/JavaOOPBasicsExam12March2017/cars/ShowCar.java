package JavaOOPBasicsExam12March2017.cars;

import JavaOOPBasicsExam12March2017.abstraction.Car;

/**
 * Created by Mihail on 3/12/2017.
 */
public class ShowCar extends Car {

    private static final String CAR_TYPE = "Show";

    private int stars;

    public ShowCar(String carBrand, String carModel, int carYearOfProduction, int carHorsePower, int carAcceleration, int carSuspension, int carDurability) {
        super(CAR_TYPE, carBrand, carModel, carYearOfProduction, carHorsePower, carAcceleration, carSuspension, carDurability);
        this.stars = 0;
    }

    public int getStars() {
        return this.stars;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s %d%n", super.getCarBrand(), super.getCarModel(), super.getCarYearOfProduction()));
        sb.append(String.format("%d HP, 100 m/h in %d s%n", super.getCarHorsePower(), super.getCarAcceleration()));
        sb.append(String.format("%d Suspension force, %d Durability%n", super.getCarSuspension(), super.getCarDurability()));
        sb.append(String.format("%d *%n", this.getStars()));
        return sb.toString();
    }
}

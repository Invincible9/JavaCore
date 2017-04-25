package JavaOOPBasicsExam12March2017.cars;

import JavaOOPBasicsExam12March2017.abstraction.Car;

import java.util.*;

/**
 * Created by Mihail on 3/12/2017.
 */
public class PerformanceCar extends Car {

    private static final String CAR_TYPE = "Performance";

    private Map<String, Car> carList;
    private List<String> addOns;

    public PerformanceCar(String carBrand, String carModel, int carYearOfProduction, int carHorsePower, int carAcceleration, int carSuspension, int carDurability) {
        super(CAR_TYPE, carBrand, carModel, carYearOfProduction, carHorsePower, carAcceleration, carSuspension, carDurability);
        this.addOns = new ArrayList<>();
        this.carList = new HashMap<>();
    }

    public Map<String, Car> getCarList() {
        return Collections.unmodifiableMap(this.carList);
    }

    public List<String> getAddOns() {
        return Collections.unmodifiableList(this.addOns);
    }

    @Override
    public int getCarHorsePower() {
        return this.calcHorsepower(super.getCarHorsePower());
    }


    @Override
    public int getCarSuspension() {
        return this.calcSuspension(super.getCarSuspension());
    }

    private int calcHorsepower(int horsepower) {
        return horsepower + ((100 * 50) / 100);
    }

    private int calcSuspension(int suspension) {
        return suspension - ((100 * 25) / 100);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s %d%n", super.getCarBrand(), super.getCarModel(), super.getCarYearOfProduction()));
        sb.append(String.format("%d HP, 100 m/h in %d s%n", this.getCarHorsePower(), super.getCarAcceleration()));
        sb.append(String.format("%d Suspension force, %d Durability%n", this.getCarSuspension(), super.getCarDurability()));
        sb.append(String.format("Add-ons: %s", this.addOns.size() < 0 ? "None" : String.join(", ", this.addOns)));
        return sb.toString();
    }

}

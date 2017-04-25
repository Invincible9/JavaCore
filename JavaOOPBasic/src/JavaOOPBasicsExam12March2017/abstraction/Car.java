package JavaOOPBasicsExam12March2017.abstraction;

/**
 * Created by Mihail on 3/12/2017.
 */
public abstract class Car {

    private String carType;
    private String carBrand;
    private String carModel;
    private int carYearOfProduction;
    private int carHorsePower;
    private int carAcceleration;
    private int carSuspension;
    private int carDurability;

    public Car(String carType, String carBrand, String carModel, int carYearOfProduction, int carHorsePower, int carAcceleration, int carSuspension, int carDurability) {
        this.carType = carType;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYearOfProduction = carYearOfProduction;
        this.carHorsePower = carHorsePower;
        this.carAcceleration = carAcceleration;
        this.carSuspension = carSuspension;
        this.carDurability = carDurability;
    }

    public int getCarHorsePower() {
        return this.carHorsePower;
    }

    public int getCarSuspension() {
        return this.carSuspension;
    }

    public String getCarType() {
        return this.carType;
    }

    public String getCarBrand() {
        return this.carBrand;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public int getCarYearOfProduction() {
        return this.carYearOfProduction;
    }

    public int getCarAcceleration() {
        return this.carAcceleration;
    }

    public int getCarDurability() {
        return this.carDurability;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

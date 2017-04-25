package InterfacesAndAbstraction_Lab.CarShop_01;

/**
 * Created by Mihail on 3/14/2017.
 */
public class Seat implements Car {

    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format(
                "This is %s produced in %s and have %d tires",
                this.getModel(),
                this.getCountryProduced(),
                Car.TIRES);
    }
}
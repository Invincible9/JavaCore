package JavaOOPBasicsExam12March2017.garage;

import JavaOOPBasicsExam12March2017.abstraction.Car;

import java.util.*;

/**
 * Created by Mihail on 3/12/2017.
 */
public class Garage {

    private List<Car> parkedCars;

    public Garage(){
        this.parkedCars = new ArrayList<>();
    }

    public List<Car> getParkedCars() {
        return Collections.unmodifiableList(this.parkedCars);
    }

    protected void addCar(Car car){
        this.parkedCars.add(car);
    }

    protected void setParkedCars(List<Car> parkedCars) {
        this.parkedCars = parkedCars;
    }
}


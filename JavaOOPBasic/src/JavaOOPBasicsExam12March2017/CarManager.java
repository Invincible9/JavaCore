package JavaOOPBasicsExam12March2017;

import JavaOOPBasicsExam12March2017.abstraction.Car;
import JavaOOPBasicsExam12March2017.abstraction.Race;
import JavaOOPBasicsExam12March2017.cars.PerformanceCar;
import JavaOOPBasicsExam12March2017.cars.ShowCar;
import JavaOOPBasicsExam12March2017.garage.Garage;
import JavaOOPBasicsExam12March2017.races.CasualRace;
import JavaOOPBasicsExam12March2017.races.DragRace;
import JavaOOPBasicsExam12March2017.races.DriftRace;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mihail on 3/12/2017.
 */
public class CarManager {
    private Map<Integer, Car> cars;
    private Map<Integer, Race> raceCar;
    private Map<Integer, Car> garageMap;


    public CarManager() {
        this.cars = new HashMap<>();
        this.raceCar = new HashMap<>();
        this.garageMap = new HashMap<>();
    }

    public void register(int id, String type, String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        Car car = null;
        switch (type.toLowerCase()) {
            case "performance":
                car = new PerformanceCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                cars.putIfAbsent(id, car);
                break;
            case "show":
                car = new ShowCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                cars.putIfAbsent(id, car);
            default:
                break;
        }
    }

    public String check(int id) {
        StringBuilder sb = new StringBuilder();
        if (this.cars.containsKey(id)) {
            for (Map.Entry<Integer, Car> integerCarEntry : cars.entrySet()) {
                sb.append(integerCarEntry.getValue());
            }
        }
        return sb.toString();
    }

    public void open(int id, String type, int length, String route, int prizePool) {
        Race race = null;

        switch (type.toLowerCase()) {
            case "casual":
                race = new CasualRace(length, route, prizePool);
                raceCar.putIfAbsent(id, race);
                break;
            case "drag":
                race = new DragRace(length, route, prizePool);
                raceCar.putIfAbsent(id, race);
                break;
            case "drift":
                race = new DriftRace(length, route, prizePool);
                raceCar.putIfAbsent(id, race);
                break;
        }
    }

    public void participate(int carId, int raceId) {

    }

    public String start(int id) {

        return "";

    }

    public void park(int id) {
        this.garageMap.putIfAbsent(id, this.cars.get(id));
    }

    public void unpark(int id) {
        this.garageMap.remove(id);
    }

    public void tune(int tuneIndex, String addOn) {

    }

}

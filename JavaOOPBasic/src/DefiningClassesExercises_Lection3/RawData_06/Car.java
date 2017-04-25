package DefiningClassesExercises_Lection3.RawData_06;

import java.util.List;

/**
 * Created by Mihail on 2/25/2017.
 */
public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tires> tiresList;

    public Car(String model, Engine engine, Cargo cargo, List<Tires> tires){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tiresList = tires;
    }

    public String getModel() {
        return model;
    }

    public List<Tires> getTiresList() {
        return tiresList;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return this.getModel();
    }
}

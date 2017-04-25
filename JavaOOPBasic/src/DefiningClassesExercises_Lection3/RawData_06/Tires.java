package DefiningClassesExercises_Lection3.RawData_06;

/**
 * Created by Mihail on 2/25/2017.
 */
public class Tires {

    private Integer age;
    private Double pressure;

    public Tires(Double pressure, Integer age) {
        this.pressure = pressure;
        this.age = age;
    }

    public Double getPressure() {
        return pressure;
    }


}

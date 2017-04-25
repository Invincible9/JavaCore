package DefiningClassesExercises_Lection3.RawData_06;

/**
 * Created by Mihail on 2/25/2017.
 */
public class Cargo {
    private Integer weight;
    private String type;

    public Cargo(Integer weight, String type){
        this.weight = weight;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

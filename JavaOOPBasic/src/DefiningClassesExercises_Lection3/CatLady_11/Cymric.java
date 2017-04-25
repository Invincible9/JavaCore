package DefiningClassesExercises_Lection3.CatLady_11;

/**
 * Created by Mihail on 2/26/2017.
 */
public class Cymric extends Cat {
    private String earSize;

    public Cymric(String name, String earSize) {
        super(name);
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return String.format("Cymric %s %s", this.name, this.earSize);
    }
}

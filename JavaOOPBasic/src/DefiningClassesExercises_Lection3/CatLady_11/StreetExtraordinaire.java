package DefiningClassesExercises_Lection3.CatLady_11;

/**
 * Created by Mihail on 2/26/2017.
 */
public class StreetExtraordinaire extends Cat {
    private String decibelsOfMeows;

    public StreetExtraordinaire(String name, String decibelsOfMeows) {
        super(name);
        this.decibelsOfMeows = decibelsOfMeows;
    }

    @Override
    public String toString() {
        return String.format("StreetExtraordinaire %s %s", this.name,  this.decibelsOfMeows);
    }
}

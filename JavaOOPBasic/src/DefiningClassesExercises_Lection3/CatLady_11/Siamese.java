package DefiningClassesExercises_Lection3.CatLady_11;

/**
 * Created by Mihail on 2/26/2017.
 */
public class Siamese extends Cat {
    private String furLength;

    public Siamese(String name, String furLength) {
        super(name);
        this.furLength = furLength;
    }

    @Override
    public String toString() {
        return String.format("Siamese %s %s", this.name, this.furLength);
    }

}

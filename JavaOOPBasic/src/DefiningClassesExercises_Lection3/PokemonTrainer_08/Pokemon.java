package DefiningClassesExercises_Lection3.PokemonTrainer_08;

/**
 * Created by Mihail on 2/28/2017.
 */
public class Pokemon {

    private String _name;
    private String _element;
    private int _health;

    Pokemon(String name, String element, int health) {
        this._name = name;
        this._element = element;
        this._health = health;
    }

    public String getElement() {
        return this._element;
    }

    public int getHealth() {
        return this._health;
    }

    public void increaseHealth() {
        this._health -= 10;
    }


}

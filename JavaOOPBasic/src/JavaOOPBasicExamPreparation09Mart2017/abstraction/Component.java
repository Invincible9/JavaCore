package JavaOOPBasicExamPreparation09Mart2017.abstraction;

/**
 * Created by Mihail on 3/11/2017.
 */
public abstract class Component {
    private String name;
    private String type;

    public Component(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public abstract int getCapacity();

    public abstract int getMemory();

}

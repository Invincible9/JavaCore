package InterfacesAndAbstraction_Lab.SayHello_03;

/**
 * Created by Mihail on 3/14/2017.
 */
public class European implements Person {
    private String name;

    public European(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}

package InterfacesAndAbstraction_Lab.SayHelloExtended_04;

/**
 * Created by Mihail on 3/14/2017.
 */
public abstract class BasePerson implements Person {
    private String name;

    protected BasePerson(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String sayHello(){
        return "Hello";
    }
}

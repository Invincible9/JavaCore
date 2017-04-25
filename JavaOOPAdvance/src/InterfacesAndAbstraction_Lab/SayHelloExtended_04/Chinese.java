package InterfacesAndAbstraction_Lab.SayHelloExtended_04;

/**
 * Created by Mihail on 3/14/2017.
 */
public class Chinese extends BasePerson implements Person {

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}

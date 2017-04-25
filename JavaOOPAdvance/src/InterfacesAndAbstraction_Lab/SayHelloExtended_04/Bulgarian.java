package InterfacesAndAbstraction_Lab.SayHelloExtended_04;

/**
 * Created by Mihail on 3/14/2017.
 */
public class Bulgarian extends BasePerson implements Person {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}

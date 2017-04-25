package InterfaceSegregationDependencyInversionPrinciples_Lab.p01_system_resources;

/**
 * Created by Mihail on 4/6/2017.
 */
public class ConsoleWriter implements Writer {

    @Override
    public void writeLn(String message) {
        System.out.println(message);
    }
}

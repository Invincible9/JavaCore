package InterfaceSegregationDependencyInversionPrinciples_Lab.p01_system_resources;

/**
 * Created by Mihail on 4/6/2017.
 */
public class Main {
    public static void main(String[] args) {
        GreetingClock clock = new GreetingClock(new LocalTimeProvider(), new ConsoleWriter());

        clock.greeting();
    }
}

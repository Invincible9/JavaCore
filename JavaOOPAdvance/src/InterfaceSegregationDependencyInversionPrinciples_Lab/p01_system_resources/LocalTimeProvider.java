package InterfaceSegregationDependencyInversionPrinciples_Lab.p01_system_resources;

import java.time.LocalTime;

/**
 * Created by Mihail on 4/6/2017.
 */
public class LocalTimeProvider implements TimeProvider {
    @Override
    public int getHour() {
        return LocalTime.now().getHour();
    }
}

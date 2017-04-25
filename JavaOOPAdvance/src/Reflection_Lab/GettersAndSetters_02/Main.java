package Reflection_Lab.GettersAndSetters_02;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Mihail on 3/28/2017.
 */
public class Main {

    public static void main(String[] args) {
        Class<Reflection> reflectionClass = Reflection.class;
        Method[] allMethods = reflectionClass.getDeclaredMethods();

        Method[] allGetters = Arrays.stream(allMethods).filter(e -> e.getName().startsWith("get")).toArray(Method[]::new);
        Method[] allSetters = Arrays.stream(allMethods).filter(e -> e.getName().startsWith("set")).toArray(Method[]::new);

        Arrays.sort(allGetters, Comparator.comparing(Method::getName));
        Arrays.sort(allSetters, Comparator.comparing(Method::getName));

        for (Method allGetter : allGetters) {
            System.out.println(allGetter.getName() + " will return " + allGetter.getReturnType());
        }

        for (Method allSetter : allSetters) {
            if (void.class.equals(allSetter.getReturnType())) {
                System.out.println(allSetter.getName() + " and will set field of " + allSetter.getParameterTypes()[0]);
            }
        }
    }
}

package Reflection_Lab.HighQualityMistakes_03;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import java.util.Comparator;

/**
 * Created by Mihail on 3/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        Class<Reflection> reflectionClass = Reflection.class;
        Method[] allMethods = reflectionClass.getDeclaredMethods();

        Field[] allFields = reflectionClass.getDeclaredFields();

        Arrays.sort(allFields, Comparator.comparing(Field::getName));

        for (Field allField : allFields) {
            if (!Modifier.isPrivate(allField.getModifiers())) {
                System.out.println(String.format("%s must be private!", allField.getName()));
            }
        }

        Method[] allGetters = Arrays.stream(allMethods).filter(e -> e.getName().startsWith("get")).toArray(Method[]::new);
        Method[] allSetters = Arrays.stream(allMethods).filter(e -> e.getName().startsWith("set")).toArray(Method[]::new);

        Arrays.sort(allGetters, Comparator.comparing(Method::getName));
        Arrays.sort(allSetters, Comparator.comparing(Method::getName));

        for (Method allGetter : allGetters) {
            if (!Modifier.isPublic(allGetter.getModifiers())) {
                System.out.println(String.format("%s have to be public!", allGetter.getName()));
            }
        }

        for (Method allSetter : allSetters) {
            if (void.class.equals(allSetter.getReturnType())) {
                if (allSetter.getParameterCount() == 1) {
                    if (!Modifier.isPrivate(allSetter.getModifiers())) {
                        System.out.println(String.format("%s have to be private!", allSetter.getName()));
                    }
                }
            }
        }
    }
}

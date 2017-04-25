package Reflection_Lab.Reflection_01;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Mihail on 3/28/2017.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Reflection> reflectionClass = Reflection.class;
        System.out.println(reflectionClass);

        Class<? super Reflection> superclass = reflectionClass.getSuperclass();
        System.out.println(superclass);

        Class<?>[] interfaces = reflectionClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

//        Object object = reflectionClass.getConstructor().newInstance(); // better way to get instance of object

        Object reflection = reflectionClass.newInstance();
        System.out.println(reflection);


    }

}

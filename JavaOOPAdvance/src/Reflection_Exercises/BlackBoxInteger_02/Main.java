package Reflection_Exercises.BlackBoxInteger_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Mihail on 3/29/2017.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, NoSuchFieldException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class<?> blackBoxIntClass = BlackBoxInt.class;
        Constructor constructor = blackBoxIntClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        Object instance = constructor.newInstance();

        String info = reader.readLine();

        while (!info.equals("END")){
            int index = info.indexOf("_");
            String funcName = info.substring(0, index);
            String number = info.substring(index + 1);

            Method method = blackBoxIntClass.getDeclaredMethod(funcName, int.class);
            method.setAccessible(true);
            method.invoke(instance, Integer.parseInt(number));

            Field field = blackBoxIntClass.getDeclaredField("innerValue");
            field.setAccessible(true);
            System.out.println(field.get(instance));

            info = reader.readLine();
        }

    }
}


package Reflection_Exercises.HarvestingFields_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/**
 * Created by Mihail on 3/29/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class<RichSoilLand> richSoilLandClass = RichSoilLand.class;

        Field[] allFields = richSoilLandClass.getDeclaredFields();


        String commands = reader.readLine();

        while (!commands.equals("HARVEST")) {

            switch (commands.toLowerCase()) {
                case "private":
                    for (Field allField : allFields) {
                        String modifier = Modifier.toString(allField.getModifiers());

                        if (Modifier.isPrivate(allField.getModifiers())) {
                            System.out.println(String.format("%s %s %s", modifier, allField.getType().getSimpleName(), allField.getName()));
                        }
                    }
                    break;
                case "public":
                    for (Field allField : allFields) {
                        String modifier = Modifier.toString(allField.getModifiers());

                        if (Modifier.isPublic(allField.getModifiers())) {
                            System.out.println(String.format("%s %s %s", modifier, allField.getType().getSimpleName(), allField.getName()));
                        }
                    }
                    break;

                case "protected":
                    for (Field allField : allFields) {
                        String modifier = Modifier.toString(allField.getModifiers());

                        if (Modifier.isProtected(allField.getModifiers())) {
                            System.out.println(String.format("%s %s %s", modifier, allField.getType().getSimpleName(), allField.getName()));
                        }
                    }
                    break;

                case "all":
                    for (Field allField : allFields) {
                        String modifier = Modifier.toString(allField.getModifiers());
                        System.out.println(String.format("%s %s %s", modifier, allField.getType().getSimpleName(), allField.getName()));
                    }
                    break;
                default:
                    break;
            }

            commands = reader.readLine();
        }


    }
}

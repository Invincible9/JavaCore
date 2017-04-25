package JavaOOPBasicExamPreparation09Mart2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 3/11/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TheSystem system = new TheSystem();

        String info = reader.readLine();

        while (!info.equals("System Split")) {
            int index = info.indexOf("(");
            String command = info.substring(0, index);
            int lastIndex = info.indexOf(")");

            String elementsInfo = info.substring(index + 1, lastIndex);
            String[] elements = elementsInfo.split(", ");

            switch (command.toLowerCase()) {
                case "registerPowerHardware":
                    system.registerPowerHardware(elements[0], Integer.parseInt(elements[1]), Integer.parseInt(elements[2]));
                    break;
                case "registerHeavyHardware":
                    system.registerHeavyHardware(elements[0], Integer.parseInt(elements[1]), Integer.parseInt(elements[2]));
                    break;
                case "registerExpressSoftware":
                    system.registerExpressSoftware(elements[0], elements[1], Integer.parseInt(elements[2]), Integer.parseInt(elements[3]));
                    break;
                case "registerLightSoftware":
                    system.registerLightSoftware(elements[0], elements[1], Integer.parseInt(elements[2]), Integer.parseInt(elements[3]));
                    break;
                case "releaseSoftwareComponent":
                    system.releaseSoftwareComponent(elements[0], elements[1]);
                    break;
                case "analyze":
                    System.out.println(system.analyze());
                    break;
                default:
                    break;
            }
            info = reader.readLine();
        }

        System.out.println(system.split());
    }
}

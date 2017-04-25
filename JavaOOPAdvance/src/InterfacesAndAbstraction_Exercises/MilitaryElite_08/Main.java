package InterfacesAndAbstraction_Exercises.MilitaryElite_08;

import InterfacesAndAbstraction_Exercises.MilitaryElite_08.abstraction.Private;
import InterfacesAndAbstraction_Exercises.MilitaryElite_08.interfaces.*;
import InterfacesAndAbstraction_Exercises.MilitaryElite_08.models.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        LinkedHashMap<Integer, Soldier_Interface> soldiers = new LinkedHashMap<>();

        while (!info.equals("End")) {
            String[] infoSplit = info.split("\\s+");

            int Id = Integer.parseInt(infoSplit[1]);
            String firstName = infoSplit[2];
            String lastName = infoSplit[3];

            switch (infoSplit[0].toLowerCase()) {
                case "private":
                    Private_Interface aPrivate = new Private(Id, firstName, lastName, Double.parseDouble(infoSplit[4]));
                    try {
                        soldiers.putIfAbsent(aPrivate.getId(), aPrivate);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "leutenantgeneral":

                        LeutenantGeneral_Interface leutenantGeneral = new LeutenantGeneral(Id, firstName, lastName, Double.parseDouble(infoSplit[4]));
                        for (int i = 5; i < infoSplit.length; i++) {
                            leutenantGeneral.addElement((Private) soldiers.get(Integer.valueOf(infoSplit[i])));
                        }
                        try {
                            soldiers.putIfAbsent(leutenantGeneral.getId(), leutenantGeneral);
                        }catch (IllegalArgumentException ex){
                            System.out.println(ex.getMessage());
                        }

                    break;
                case "engineer":

                        Engineer_Interface engineer = new Engineer(Id, firstName, lastName, Double.parseDouble(infoSplit[4]), infoSplit[5]);
                        for (int i = 6; i < infoSplit.length; i+=2) {
                            engineer.addRepairs(new Repairs(infoSplit[i], Integer.parseInt(infoSplit[i + 1])));
                        }
                        try {
                            soldiers.putIfAbsent(engineer.getId(), engineer);
                        }catch (IllegalArgumentException ex){
                            System.out.println(ex.getMessage());
                        }

                    break;
                case "commando":

                        Commando_Interface commando = new Commando(Id, firstName, lastName, Double.parseDouble(infoSplit[4]), infoSplit[5]);
                        for (int i = 6; i < infoSplit.length; i+=2) {
                            try {
                                commando.addMission(new Missions(infoSplit[i], infoSplit[i + 1]));
                            } catch (IllegalArgumentException ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                        soldiers.putIfAbsent(commando.getId(), commando);

                    break;
                case "spy":
                    Spy_Interface spy = new Spy(Integer.parseInt(infoSplit[1]), infoSplit[2], infoSplit[3], infoSplit[4]);
                    try {
                        soldiers.putIfAbsent(spy.getId(), spy);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                default:
                    break;
            }

            info = reader.readLine();
        }

        for (Soldier_Interface soldier_interface : soldiers.values()) {
            System.out.println(soldier_interface.toString().trim());
        }

    }
}

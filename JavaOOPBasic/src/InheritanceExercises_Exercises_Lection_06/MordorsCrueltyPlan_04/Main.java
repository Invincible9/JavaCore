package InheritanceExercises_Exercises_Lection_06.MordorsCrueltyPlan_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Mihail on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] info = reader.readLine().split("\\s+");
//        Arrays.stream(info).filter(p -> !p.equals("")).collect(Collectors.toList());

        GandalfMoods gandalf = new GandalfMoods();

        for (String s : info) {
            gandalf.calcPoints(s);
        }
        gandalf.setMood();

        System.out.println(gandalf.getHappinessPoints());
        System.out.println(gandalf.getMood());

    }
}

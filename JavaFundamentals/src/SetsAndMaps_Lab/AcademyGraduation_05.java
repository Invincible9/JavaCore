package SetsAndMaps_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.TreeMap;

/**
 * Created by Mihail on 4/6/2017.
 */
public class AcademyGraduation_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        TreeMap<String, Double> assessments = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = reader.readLine();

            double[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

            double average = 0.0;
            for (double number : numbers) {
                average += number;
            }

            average /= numbers.length;

            if (!assessments.containsKey(name)) {
                assessments.put(name, average);
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.################");
        for (String key : assessments.keySet()) {
            System.out.println(key + " is graduated with " + decimalFormat.format(assessments.get(key)));
        }

    }
}

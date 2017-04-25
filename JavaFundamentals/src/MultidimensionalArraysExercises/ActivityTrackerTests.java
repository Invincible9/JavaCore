package MultidimensionalArraysExercises;

import java.util.*;

/**
 * Created by Mihail on 2/20/2017.
 */
public class ActivityTrackerTests {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countDataLines = Integer.parseInt(input.nextLine());

//        TreeMap<Integer, String> dateUser = new TreeMap<>();
//        TreeMap<String, Long> userDistance = new TreeMap<>();

        TreeMap<Integer, TreeMap<String, Integer>> months = new TreeMap<>();

        for (int i = 0; i < countDataLines; i++) {
            String[] dataInfoSplit = input.nextLine().split("\\s+");

            String dateInfo = dataInfoSplit[0];
            String user = dataInfoSplit[1];
            int distance = Integer.parseInt(dataInfoSplit[2]);

//            String[] dateInfoSplit = dateInfo.split("/");
//            int month = Integer.parseInt(dateInfoSplit[1].substring(1));

            int startIndex = dateInfo.indexOf("/");
            int endIndex = dateInfo.indexOf("/", startIndex + 1);

            String date = dateInfo.substring(startIndex + 1, endIndex);

            int month = Integer.parseInt(date.substring(1));
            startIndex = endIndex + 1;

            if (!months.containsKey(month)) {
                TreeMap<String, Integer> users = new TreeMap<>();
                users.put(user, distance);
                months.put(month, users);
            } else {
                //check if the user is already present or not and act accordingly
                TreeMap<String, Integer> users = months.get(month);
                if (!users.containsKey(user)) {
                    users.put(user, distance);
                } else {
                    int tempDistance = users.get(user);
                    tempDistance += distance;
                    users.put(user, tempDistance);
                }
                months.put(month, users);
            }

        }

        for (Iterator it = months.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry month = (Map.Entry) it.next();

            String outputLine = month.getKey() + ": ";

            TreeMap users = (TreeMap) month.getValue();
            for (Iterator it2 = users.entrySet().iterator(); it2.hasNext(); ) {
                Map.Entry user = (Map.Entry) it2.next();

                outputLine += user.getKey() + "(" + user.getValue() + "), ";
            }

            outputLine = outputLine.substring(0, outputLine.length() - 2);
            System.out.println(outputLine);
        }


    }
}

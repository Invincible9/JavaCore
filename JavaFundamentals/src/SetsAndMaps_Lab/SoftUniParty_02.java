package SetsAndMaps_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/**
 * Created by Mihail on 4/6/2017.
 */
public class SoftUniParty_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<String> guestAndVips = new TreeSet<>();

        String info = reader.readLine();

        while (!info.equals("PARTY")) {

            if (!guestAndVips.contains(info)) {
                guestAndVips.add(info);
            }

            info = reader.readLine();
        }

        String noMoreGuest = reader.readLine();

        while (!noMoreGuest.equals("END")) {

            if (guestAndVips.contains(noMoreGuest)) {
                guestAndVips.remove(noMoreGuest);
            }

            noMoreGuest = reader.readLine();
        }

        System.out.println(guestAndVips.size());
        guestAndVips.stream().filter(e -> e.length() == 8 && Character.isDigit(e.charAt(0))).forEach(System.out::println);
//        guestAndVips.removeAll(guestAndVips.stream().filter(e -> e.length() == 8 && Character.isDigit(e.charAt(0))).collect(Collectors.toList()));

        guestAndVips.stream().filter(e -> e.length() == 8 && !Character.isDigit(e.charAt(0))).forEach(System.out::println);

    }
}

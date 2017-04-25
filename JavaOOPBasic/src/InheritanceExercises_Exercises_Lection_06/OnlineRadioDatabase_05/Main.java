package InheritanceExercises_Exercises_Lection_06.OnlineRadioDatabase_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int songsCount = Integer.parseInt(reader.readLine());

        List<Song> songList = new ArrayList<>();

        while (songsCount-- > 0) {
            String[] songsInfo = reader.readLine().split(";");

            String artistName = songsInfo[0];
            String songName = songsInfo[1];

            String[] time = songsInfo[2].split(":");
            int minutes = Integer.parseInt(time[0]);
            int seconds = Integer.parseInt(time[1]);

            Song song = null;

            try {
                song = new Song(artistName, songName, minutes, seconds);
                songList.add(song);
                System.out.println("Song added.");
            } catch (InvalidSongException ex) {
                System.out.println(ex.getMessage());
            }
        }


        System.out.printf("Songs added: %d", songList.size());

        for (Song song : songList) {
            System.out.println();
        }

    }
}

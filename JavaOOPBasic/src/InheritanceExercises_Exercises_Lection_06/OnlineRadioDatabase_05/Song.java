package InheritanceExercises_Exercises_Lection_06.OnlineRadioDatabase_05;

/**
 * Created by Mihail on 3/2/2017.
 */
public class Song {
    private String artistName;
    private String songName;
    private int songLength;
    private int songMinutes;
    private int songSeconds;

    public Song() {
        //default constructor
    }

    public Song(String artistName, String songName, int songMinutes, int songSeconds) {
        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setSongMinutes(songMinutes);
        this.setSongSeconds(songSeconds);
    }

    public String getArtistName() {
        return artistName;
    }

    protected void setArtistName(String artistName) {
        if (this.artistName.trim().length() < 3 || this.artistName.trim().length() > 20) {
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
        }
        this.artistName = artistName;
    }

    public String getSongName() {
        return songName;
    }

    protected void setSongName(String songName) {
        if (this.songName.trim().length() < 3 || this.songName.trim().length() > 30) {
            throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
        }
        this.songName = songName;
    }

    public int getSongLength() {
        return songLength;
    }

    protected void setSongLength(int songLength) {
        if ((this.songMinutes < 0 || this.songMinutes > 14) && (this.songSeconds < 0 || this.songSeconds > 59)) {
            throw new InvalidSongLengthException("Invalid song length.");
        }
        this.songLength = songLength;
    }

    public int getSongMinutes() {
        return songMinutes;
    }

    protected void setSongMinutes(int songMinutes) {
        if ((this.songMinutes < 0 || this.songMinutes > 14)) {
            throw new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
        }
        this.songMinutes = songMinutes;
    }

    public int getSongSeconds() {
        return songSeconds;
    }

    protected void setSongSeconds(int songSeconds) {
        if (this.songSeconds < 0 || this.songSeconds > 59) {
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
        }
        this.songSeconds = songSeconds;
    }

    public int calcAllSeconds(){
        return ((this.songMinutes * 60) + this.songSeconds);
    }

    public int getHours(int seconds) {

        int hours = 0;
        if (this.songMinutes > 59) {
            hours++;
        }
        return hours;
    }

    @Override
    public String toString() {
        return String.format("Playlist length: %dh %dm %ds", this.getHours(this.songMinutes), this.getSongMinutes(), this.getSongSeconds());
    }
}

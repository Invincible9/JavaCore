package EnumerationsAndAnnotations_Lab.WarningLevels_02;

/**
 * Created by Mihail on 3/27/2017.
 */
public class Message {

    private Importance level;
    private String content;

    public Message(Importance level, String content) {
        this.level = level;
        this.content = content;
    }

    public Importance getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.level, this.content);
    }

}

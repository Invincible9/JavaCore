package InheritanceExercises_Exercises_Lection_06.OnlineRadioDatabase_05;

/**
 * Created by Mihail on 3/2/2017.
 */
public abstract class InvalidSongException extends IllegalArgumentException {

    private String message;

    public InvalidSongException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    protected void setMessage(String message) {
        this.message = message;
    }

}

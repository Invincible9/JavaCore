package Stack_Implementation;

/**
 * Created by Mihail on 3/23/2017.
 */
public class StackOverflowException extends RuntimeException {

    public StackOverflowException(){
        super ();
    }

    public StackOverflowException(String message){
        super (message);
    }

    public StackOverflowException(String message, Throwable cause){
        super (message, cause);
    }
}
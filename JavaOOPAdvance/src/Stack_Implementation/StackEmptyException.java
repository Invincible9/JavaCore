package Stack_Implementation;

/**
 * Created by Mihail on 3/23/2017.
 */
public class StackEmptyException extends RuntimeException{

    public StackEmptyException(){
        super ();
    }

    public StackEmptyException(String message){
        super (message);
    }

    public StackEmptyException(String message, Throwable cause){
        super (message, cause);
    }
}
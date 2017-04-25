package EnumerationsAndAnnotations_Lab.WarningLevels_02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/27/2017.
 */
public class Logger {

    private Importance treshold;
    private List<Message> messages;

    public Logger(Importance treshold) {
        this.treshold = treshold;
        this.messages = new ArrayList<>();
    }

    public void records(Message message){
        if(message.getLevel().compareTo(this.treshold) >= 0){
            this.messages.add(message);
        }
    }

    public Iterable<Message> getMessages(){
        return this.messages;
    }

//    public static void main(String[] args) {
//        Logger logger = new Logger(Importance.LOW);
//
//        logger.records(new Message(Importance.NORMAL, "All Systems running"));
//        logger.records(new Message(Importance.HIGH, "Leakage in core room"));
//        logger.records(new Message(Importance.LOW, "Food delivery"));
//
//        Iterable<Message> messages = logger.getMessages();
//
//        for (Message message : messages) {
//            System.out.println(message);
//        }
//
//    }

}

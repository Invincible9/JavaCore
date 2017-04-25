package InterfacesAndAbstraction_Exercises.Telephony_04;

/**
 * Created by Mihail on 3/15/2017.
 */
public class Smartphone implements Browse, Calls {

    @Override
    public String calls(String phoneNumber) {
        if (!phoneNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid number!");
        } else {
            return "Calling... " + phoneNumber;
        }

    }

    @Override
    public String browsing(String url) {
        if (url.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Invalid URL!");
        } else {
            return "Browsing... " + url + "!";
        }
    }


}

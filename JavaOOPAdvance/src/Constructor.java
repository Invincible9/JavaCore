/**
 * Created by Mihail on 3/28/2017.
 */
public class Constructor {

    static String str;

    public Constructor(){
        str = "Hello";
    }

    public void Constructor(){
        System.out.println("In constructor");
        str = "Hello World";
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(str);
    }

}
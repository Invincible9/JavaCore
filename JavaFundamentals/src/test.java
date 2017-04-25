import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 4/5/2017.
 */
public class test {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int num = 321;
//        int sum = 0;
//        while (num > 0) {
//            sum = sum + num % 10;
//            num = num / 10;
//        }
//        System.out.println(sum);

//        int sum = 60;
//        if (sum / 60 < 9) {
//            System.out.printf("call ended. duration: %02d:%02d\n", sum / 60, (sum % 60));
//        } else {
//            System.out.printf("call ended. duration: %d:%d\n", sum / 60, (sum % 60));
//        }

        long sum = differenceDigit("+(602)207-2544");
        System.out.println(sum);
//
//        if(Math.abs(sum % 2) == 1){
//            System.out.println("odd");
//        }else{
//            System.out.println("even");
//        }

    }

    public static long differenceDigit(String text) {
        long sum = 0;

        for (int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))){
                sum -= Integer.parseInt(String.valueOf(text.charAt(i)));

            }
        }
        return sum;
    }

    public static long sumDigit(String text) {
        long sum = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {

                sum += Integer.parseInt(String.valueOf(text.charAt(i)));
            }
        }
        return sum;
    }
}

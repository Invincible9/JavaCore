package OpenClosedAndLiskovPrinciple_Lab.P02_FileStream;

/**
 * Created by Mihail on 4/5/2017.
 */
public class Main {
    public static void main(String[] args) {
        StreamProgressInfo stream = new StreamProgressInfo(new File(2048, 512, "Java advance"));
        StreamProgressInfo stream1 = new StreamProgressInfo(new Music(2048, 128, "Java", "Java1"));

        System.out.println(stream.calculateCurrentPercent());
        System.out.println(stream1.calculateCurrentPercent());

    }
}

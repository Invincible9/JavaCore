package OpenClosedAndLiskovPrinciple_Lab.P02_FileStream;

public class File extends BaseStream {

    private String name;

    public File(int length, int bytesSent, String name) {
        super(length, bytesSent);
        this.name = name;
    }
}

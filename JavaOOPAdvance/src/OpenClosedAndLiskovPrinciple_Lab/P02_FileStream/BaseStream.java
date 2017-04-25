package OpenClosedAndLiskovPrinciple_Lab.P02_FileStream;

/**
 * Created by Mihail on 4/5/2017.
 */
public abstract class BaseStream implements Streamable {
    private int length;
    private int bytesSent;

    protected BaseStream(int length, int bytesSent) {
        this.length = length;
        this.bytesSent = bytesSent;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getBytesSent() {
        return this.bytesSent;
    }
}

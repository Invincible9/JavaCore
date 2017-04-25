package OpenClosedAndLiskovPrinciple_Lab.P02_FileStream;

public class StreamProgressInfo {
    private BaseStream file;

    // If we want to stream a music file, we can't
    public StreamProgressInfo(BaseStream file) {
        this.file = file;
    }

    public int calculateCurrentPercent() {
        return (this.file.getBytesSent() * 100) / this.file.getLength();
    }



}

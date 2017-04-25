package InterfaceSegregationDependencyInversionPrinciples_Lab.p01_system_resources;

public class GreetingClock {

    private TimeProvider timeProvider;
    private Writer writer;

    public GreetingClock(TimeProvider timeProvider, Writer writer) {
        this.timeProvider = timeProvider;
        this.writer = writer;
    }

    public void greeting() {
        if (this.timeProvider.getHour() < 12) {
            this.writer.writeLn("Good morning...");
        } else if (this.timeProvider.getHour() < 18) {
            this.writer.writeLn("Good afternoon...");
        } else {
            this.writer.writeLn("Good evening...");
        }
    }

}

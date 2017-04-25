package InterfaceSegregationDependencyInversionPrinciples_Lab.p03_employee_info.UserInterface;

public class ConsoleClient {

    private Formatter formatter;
    private InfoProvider infoProvider;

    public ConsoleClient(Formatter formatter, InfoProvider infoProvider) {
        this.formatter = formatter;
        this.infoProvider = infoProvider;
    }

    public static void main(String[] args){
//            ConsoleClient consoleClient = new ConsoleClient();
    }

}

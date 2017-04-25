package OpenClosedAndLiskovPrinciple_Lab.P04_DetailPrinter;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }
}

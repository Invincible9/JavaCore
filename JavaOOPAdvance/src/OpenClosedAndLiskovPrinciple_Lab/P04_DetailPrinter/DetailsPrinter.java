package OpenClosedAndLiskovPrinciple_Lab.P04_DetailPrinter;

public class DetailsPrinter {

    private Iterable<Employee> employees;

    public DetailsPrinter(Iterable<Employee> employees) {
        this.employees = employees;
    }

    public void printDetails() {
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                this.printManager((Manager) employee);
            } else {
                this.printEmployee(employee);
            }
        }
    }

    private void printEmployee(Employee employee) {
        System.out.println(employee);
    }

    private void printManager(Manager manager) {
        System.out.println(manager);
    }
}

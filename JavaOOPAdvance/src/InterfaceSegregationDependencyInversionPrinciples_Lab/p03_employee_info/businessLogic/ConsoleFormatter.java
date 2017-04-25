package InterfaceSegregationDependencyInversionPrinciples_Lab.p03_employee_info.businessLogic;

import InterfaceSegregationDependencyInversionPrinciples_Lab.p03_employee_info.Employee;
import InterfaceSegregationDependencyInversionPrinciples_Lab.p03_employee_info.UserInterface.Formatter;

public class ConsoleFormatter implements Formatter {

    public String format(Iterable<Employee> employees) {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee).append(System.lineSeparator());
        }

        return sb.toString();
    }
}

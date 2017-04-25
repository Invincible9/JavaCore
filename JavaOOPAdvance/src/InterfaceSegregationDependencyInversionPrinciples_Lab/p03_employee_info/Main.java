package InterfaceSegregationDependencyInversionPrinciples_Lab.p03_employee_info;

import InterfaceSegregationDependencyInversionPrinciples_Lab.p03_employee_info.businessLogic.ConsoleFormatter;
import InterfaceSegregationDependencyInversionPrinciples_Lab.p03_employee_info.businessLogic.EmployeeInfoProvider;

public class Main {

    public static void main(String[] args) {
        EmployeeInfoProvider employeeInfo = new EmployeeInfoProvider();
        ConsoleFormatter formatter = new ConsoleFormatter();

        String output = formatter.format(employeeInfo.getEmployeesByName());
        System.out.println(output);
    }
}

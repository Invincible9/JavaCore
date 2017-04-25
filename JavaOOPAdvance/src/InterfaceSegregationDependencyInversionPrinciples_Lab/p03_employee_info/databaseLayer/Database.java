package InterfaceSegregationDependencyInversionPrinciples_Lab.p03_employee_info.databaseLayer;

import InterfaceSegregationDependencyInversionPrinciples_Lab.p03_employee_info.Employee;

import java.util.List;

/**
 * Created by Mihail on 4/6/2017.
 */
public interface Database {

    List<Employee> readEmployees();
}

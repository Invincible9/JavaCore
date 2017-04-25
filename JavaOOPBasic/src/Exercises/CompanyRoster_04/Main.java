package Exercises.CompanyRoster_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by Mihail on 2/25/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> departmentWithSalary = new HashMap<>();

        HashMap<String, TreeSet<Employee>> departmentWithEmployee = new HashMap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] info = reader.readLine().split("\\s+");

            String name = info[0];
            double salary = Double.parseDouble(info[1]);
            String position = info[2];
            String department = info[3];

            Employee employee = null;
            switch (info.length) {
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    try {

                        Integer age = Integer.parseInt(info[4]);
                        employee = new Employee(name, salary, position, department, age);
                    } catch (IllegalArgumentException ex) {
                        String email = info[4];
                        employee = new Employee(name, salary, position, department, email);
                    }
                    break;
                case 6:
                    Integer age = Integer.parseInt(info[5]);
                    String email = info[4];
                    employee = new Employee(name, salary, position, department, email, age);
                    break;
            }

            if (!departmentWithEmployee.containsKey(department)) {
                departmentWithEmployee.put(department, new TreeSet<>());
                departmentWithSalary.put(department, 0.0);
            }

            departmentWithSalary.put(department, departmentWithSalary.get(department) + salary);
            departmentWithEmployee.get(department).add(employee);
        }


        Map.Entry<String, TreeSet<Employee>> maxSalary = departmentWithEmployee.entrySet().stream()
                .sorted((s1, s2) -> Double.compare(departmentWithSalary.get(s2.getKey()), departmentWithSalary.get(s1.getKey())))
                .findFirst()
                .get();

        System.out.printf("Highest Average Salary: %s%n", maxSalary.getKey());

        for (Employee employee : maxSalary.getValue()) {
            System.out.println(employee.toString());
        }
    }



}

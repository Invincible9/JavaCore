package DefiningClassesExercises_Lection3.CompanyRoster_04;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Mihail on 2/22/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> departmentWithSalary = new HashMap<>();
        HashMap<String, TreeSet<Employee>> departmentWithEmployees = new HashMap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] info = reader.readLine().split("\\s+");

            String name = info[0];
            Double salary = Double.parseDouble(info[1]);
            String position = info[2];
            String department = info[3];

            Employee employee = null;

            switch (info.length){
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    try{
                        Integer age = Integer.valueOf(info[4]);
                        employee = new Employee(name, salary, position, department, age);
                    }catch (NumberFormatException ex){
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


//            if (info.length == 4) {
//                employee = new Employee(name, salary, position, department);
//            } else if (info.length == 5) {
//                if (isDigit(info[4])) {
//                    Integer age = Integer.parseInt(info[4]);
//                    employee = new Employee(name, salary, position, department, age);
//                } else {
//                    String email = info[4];
//                    employee = new Employee(name, salary, position, department, email);
//                }
//            } else {
//                Integer age = Integer.parseInt(info[5]);
//                String email = info[4];
//                employee = new Employee(name, salary, position, department, email, age);
//            }

            if (!departmentWithEmployees.containsKey(department)) {
                departmentWithEmployees.put(department, new TreeSet<>());
                departmentWithSalary.put(department, 0.0);
            }
            departmentWithEmployees.get(department).add(employee);
            departmentWithSalary.put(department, departmentWithSalary.get(department) + salary);
        }

        Map.Entry<String, TreeSet<Employee>> maxAverage = departmentWithEmployees
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Double.compare(departmentWithSalary.get(e2.getKey()), departmentWithSalary.get(e1.getKey())))
                .findFirst()
                .get();

        System.out.printf("Highest Average Salary: %s%n", maxAverage.getKey());

        for (Employee employee : maxAverage.getValue()) {
            System.out.println(employee);
        }

    }

    private static boolean isDigit(String word) {
        try {
            Integer.parseInt(word);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }


}

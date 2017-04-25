package Exercises.CompanyRoster_04;

/**
 * Created by Mihail on 2/25/2017.
 */
public class Employee extends Person implements Comparable<Employee> {
    //: name, salary, position, department, email
    private Double salary;
    private String position;
    private String department;
    private String email;

    public Employee(String name, Double salary, String position, String department, String email, Integer age) {
        super(name, age);
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
    }

    public Employee(String name, Double salary, String position, String department) {
        this(name, salary, position, department, "n/1", -1);
    }

    public Employee(String name, Double salary, String position, String department, String email) {
        this(name, salary, position, department, email, -1);
    }

    public Employee(String name, Double salary, String position, String department, Integer age) {
        this(name, salary, position, department, "n/1", age);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", super.getName(), this.getSalary(), this.getEmail(), super.getAge());
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(employee.salary, this.getSalary());
    }

}

package DefiningClassesExercises_Lection3.CompanyRoster_04;

/**
 * Created by Mihail on 2/22/2017.
 */
public class Employee extends Person implements Comparable<Employee> {
    //salary, position, department, email

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
        this(name, salary, position, department, "n/a", -1);
    }

    public Employee(String name, Double salary, String position, String department, String email) {
        this(name, salary, position, department, email, -1);
    }

    public Employee(String name, Double salary, String position, String department, Integer age) {
        this(name, salary, position, department, "n/a", age);
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", super.getName(), this.salary, this.email, super.getAge());
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(employee.salary, this.salary);
    }

}

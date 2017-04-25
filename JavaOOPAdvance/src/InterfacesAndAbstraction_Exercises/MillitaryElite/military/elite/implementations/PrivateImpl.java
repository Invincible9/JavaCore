package InterfacesAndAbstraction_Exercises.MillitaryElite.military.elite.implementations;


import InterfacesAndAbstraction_Exercises.MillitaryElite.military.elite.interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {
    private double salary;


    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    @Override
    public String toString() {
        return String.format("%s Salary: %.2f",super.toString(), this.getSalary());
    }

    @Override
    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }
}

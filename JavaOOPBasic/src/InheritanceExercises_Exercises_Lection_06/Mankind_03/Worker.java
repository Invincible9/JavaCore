package InheritanceExercises_Exercises_Lection_06.Mankind_03;

/**
 * Created by Mihail on 3/1/2017.
 */
public class Worker extends Human {
    private double weekSalary;
    private double workHoursperDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursperDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursperDay(workHoursperDay);
    }


    public double getWeekSalary() {
        return this.weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }

        this.weekSalary = weekSalary;
    }

    public double getWorkHoursperDay() {
        return this.workHoursperDay;
    }

    public void setWorkHoursperDay(double workHoursperDay) {
        if (workHoursperDay < 1 || workHoursperDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }

        this.workHoursperDay = workHoursperDay;
    }

    public double calculateMoneyEarnByHour() {
        return (this.weekSalary / (this.workHoursperDay * 7));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(this.getFirstName()).append("\n");
        sb.append("Last Name: ").append(this.getLastName()).append("\n");
        sb.append("Week Salary: ").append(String.format("%.2f", this.getWeekSalary())).append("\n");
        sb.append("Hours per day: ").append(String.format("%.2f", this.getWorkHoursperDay())).append("\n");
        sb.append("Salary per hour: ").append(String.format("%.2f", this.calculateMoneyEarnByHour()));
        return sb.toString();
    }

}

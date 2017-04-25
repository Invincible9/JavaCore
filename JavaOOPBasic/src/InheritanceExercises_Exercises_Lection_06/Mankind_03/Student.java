package InheritanceExercises_Exercises_Lection_06.Mankind_03;

/**
 * Created by Mihail on 3/1/2017.
 */
public class Student extends Human {
    private String facultyNumber;


    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return this.facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.trim().length() < 5 || facultyNumber.trim().length() > 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }

        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(this.getFirstName()).append("\n");
        sb.append("Last Name: ").append(this.getLastName()).append("\n");
        sb.append("Faculty number: ").append(this.getFacultyNumber()).append("\n");
        return sb.toString();
    }
}

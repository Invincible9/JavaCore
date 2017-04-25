package InheritanceExercises_Exercises_Lection_06.Mankind_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/1/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] infoStudents = reader.readLine().split("\\s+");
        String[] infoWorkers = reader.readLine().split("\\s+");

        String firstNameStudent = infoStudents[0];
        String lastNameStudent = infoStudents[1];
        String facNumber = infoStudents[2];

        String firstNameWorker = infoWorkers[0];
        String lastNameWorker = infoWorkers[1];
        double weekSalary = Double.parseDouble(infoWorkers[2]);
        double hoursPerDay = Double.parseDouble(infoWorkers[3]);

        Student student = null;
        Worker worker = null;
        try {
            student = new Student(firstNameStudent, lastNameStudent, facNumber);
            System.out.println(student.toString());
            worker = new Worker(firstNameWorker, lastNameWorker, weekSalary, hoursPerDay);
            System.out.println(worker.toString());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }


    }
}

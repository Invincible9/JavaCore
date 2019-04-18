package ObjectsAndClasses.Students;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int n = Integer.parseInt(reader.readLine());

        List<Student> students = new ArrayList<>();

        while (n-- > 0) {
            String[] data = reader.readLine().split("\\s+");

            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            students.add(student);
        }

        students.stream().sorted((e1, e2) -> Double.compare(e2.getGrade(),e1.getGrade()))
                .forEach(s -> {
                    System.out.printf("%s %s: %.2f\n", s.getFirstName(), s.getLastName(),
                            s.getGrade());
                });

    }


}

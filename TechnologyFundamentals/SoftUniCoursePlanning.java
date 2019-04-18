import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<String> schedule = Arrays.stream(reader.readLine().split(", "))
                .collect(Collectors.toList());

        String input = "";

        while (!"course start".equals(input = reader.readLine())){
            String[] data = input.split(":");

            String command = data[0];
            String lessonTitle = data[1];

            switch (command){
                case "Add":
                    if(checkIfLessonTitleDoesNotExist(schedule, lessonTitle)){
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[2]);
                    if(index >= 0 && index < schedule.size() &&
                        checkIfLessonTitleDoesNotExist(schedule, lessonTitle)){
                        schedule.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    schedule.removeIf(e -> e.contains(lessonTitle));
                    break;
                case "Swap":
                    int lesson1Index = schedule.indexOf(lessonTitle);
                    int lesson2Index = schedule.indexOf(data[2]);

                    if(lesson1Index != -1 && lesson2Index != -1){
                        schedule.set(lesson1Index, data[2]);
                        schedule.set(lesson2Index, lessonTitle);
                    }

                    int lesson1ExerciseIndex = schedule.indexOf(String.format("%s-Exercise", lessonTitle));
                    int lesson2ExerciseIndex = schedule.indexOf(String.format("%s-Exercise", data[2]));

                    if(lesson1ExerciseIndex != -1){
                        String exercise = schedule.remove(lesson1ExerciseIndex);
                        schedule.add(lesson2Index + 1, exercise);
                    }

                    if(lesson2ExerciseIndex != - 1){
                        String exercise = schedule.remove(lesson2ExerciseIndex);
                        schedule.add(lesson1Index + 1, exercise);
                    }
                    break;
                case "Exercise":
                    String exercise = String.format("%s-Exercise", lessonTitle);
                    int lessonIndex = schedule.indexOf(lessonTitle);
                    if(lessonIndex != -1 && schedule.indexOf(exercise) == -1){
                        schedule.add(schedule.indexOf(lessonTitle) + 1, exercise);
                    }

                    if(lessonIndex == -1){
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }
                    break;
            }
        }

        for (int i = 0; i < schedule.size(); i++) {
            System.out.println(String.format("%d.%s", i + 1, schedule.get(i)));
        }


    }

    public static boolean checkIfLessonTitleDoesNotExist(List<String> schedule, String lesson){
        if(schedule.indexOf(lesson) == - 1){
            return true;
        }
        return false;
    }

}

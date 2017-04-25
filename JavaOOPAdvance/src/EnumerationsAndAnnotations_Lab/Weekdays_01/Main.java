package EnumerationsAndAnnotations_Lab.Weekdays_01;


/**
 * Created by Mihail on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) {

        WeeklyCalendar weeklyCalendar = new WeeklyCalendar();
        weeklyCalendar.addEntry("Friday", "sleep");
        weeklyCalendar.addEntry("Monday", "sport");

        Iterable<WeeklyEntry> schedule = weeklyCalendar.getWeeklySchedule();

        for (WeeklyEntry weeklyEntry : schedule) {
            System.out.println(weeklyEntry);
        }


    }
}

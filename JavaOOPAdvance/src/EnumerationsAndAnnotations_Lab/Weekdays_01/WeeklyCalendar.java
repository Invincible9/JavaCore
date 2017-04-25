package EnumerationsAndAnnotations_Lab.Weekdays_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mihail on 3/27/2017.
 */
public class WeeklyCalendar {
    private List<WeeklyEntry> entryList;

    public WeeklyCalendar() {
        this.entryList = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes){
        WeeklyEntry weeklyEntry = new WeeklyEntry(weekday, notes);
        this.entryList.add(weeklyEntry);
    }

    public Iterable<WeeklyEntry> getWeeklySchedule(){
        Collections.sort(this.entryList, (e1,e2) -> Integer.compare(e1.getWeekday().ordinal(), e2.getWeekday().ordinal()));
        return this.entryList;
    }


//    public static void main(String[] args) {
//        WeeklyCalendar weeklyCalendar = new WeeklyCalendar();
//        weeklyCalendar.addEntry("Tuesday", "kvo stava");
//        weeklyCalendar.addEntry("Monday", "kvo stava 1");
//
//        for (WeeklyEntry weeklyEntry : weeklyCalendar.getWeeklySchedule()) {
//            System.out.println(weeklyEntry);
//        }
//
//    }

}

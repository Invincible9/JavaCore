package EnumerationsAndAnnotations_Lab.Weekdays_01;

import java.util.Comparator;

/**
 * Created by Mihail on 3/27/2017.
 */
public class WeeklyEntry {

//    public final static Comparator<WeeklyEntry> BY_WEEKDAY = getComparatorBydWeekDays();

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Weekday.valueOf(Weekday.class, weekday.toUpperCase());
        this.notes = notes;
    }

    public Weekday getWeekday() {
        return weekday;
    }

//    private static Comparator<WeeklyEntry> getComparatorBydWeekDays() {
//        return (e1, e2) -> Integer.compare(e1.weekday.ordinal(), e2.weekday.ordinal());
//    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.weekday, this.notes);
    }
}

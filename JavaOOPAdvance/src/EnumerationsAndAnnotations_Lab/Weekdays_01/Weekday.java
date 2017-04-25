package EnumerationsAndAnnotations_Lab.Weekdays_01;

/**
 * Created by Mihail on 3/27/2017.
 */
public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString() {
        String letter = super.name().toLowerCase().substring(1);
        return super.name().charAt(0) + letter;
    }
}

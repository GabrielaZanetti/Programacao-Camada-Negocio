package aula5.t05enumeration.e01enumsimple;

import java.time.LocalTime;

/**
 * @author gabriela.zanetti
 */
public class Appointment {

    enum WeekDay {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    private String description;
    WeekDay weekday;
    LocalTime hour;

    public Appointment(String description, WeekDay weekday, LocalTime hour) {
        this.description = description;
        this.weekday = weekday;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Appointment{" + "description=" + description + ", weekday=" + weekday + ", hour=" + hour + '}';
    }
}

package aula5.t05enumeration.e03enumwithabstractmethod;

import java.time.LocalTime;

/**
 * @author gabriela.zanetti
 */
public class Appointment {

    private String description;
    private WeekDay weekDay;
    private LocalTime hour;

    public Appointment(String description, WeekDay weekDay, LocalTime hour) {
        this.description = description;
        this.weekDay = weekDay;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Appointment{" + "description=" + description + ", weekDay=" + weekDay + ", hour=" + hour + '}';
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }
    
    
    
    
}

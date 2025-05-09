package unidade01.aula05.t05enumeration.e02enhancedenum;

import java.time.LocalTime;

/**
 * @author Eldair F. Dornelles
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
    
    
    
}

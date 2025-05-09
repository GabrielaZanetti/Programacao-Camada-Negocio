package unidade01.aula05.t05enumeration.e01enumsimple;

import java.time.LocalTime;
import unidade01.aula05.t05enumeration.e01enumsimple.Appointment.WeekDay;
/**
 *
 * @author Eldair
 */

public class Planner {
   
    public static void main(String[] args) {

           Appointment appoint01 = 
                   new Appointment("Thesis supervion meeting", WeekDay.TUESDAY, LocalTime.of(16, 30));
        
           Appointment appoint02 = 
                   new Appointment("Thesis supervion meeting", WeekDay.MONDAY, LocalTime.of(16, 30));
        
           System.out.println("appoint01: "+ appoint02);
    }
}

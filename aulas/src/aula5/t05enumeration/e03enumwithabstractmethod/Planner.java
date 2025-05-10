package aula5.t05enumeration.e03enumwithabstractmethod;

import java.time.LocalTime;

/**
 *
 * @author Eldair
 */
public class Planner {
   
    public static void main(String[] args) {
        Appointment appoint01 = 
                new Appointment("Thesis supervision meeting", 
                        WeekDay.MONDAY, LocalTime.of(16, 30));
    
        System.out.println("appoint01: "+appoint01);
        
        System.out.println("Monday: "+ WeekDay.MONDAY);
        System.out.println("Monday: "+ WeekDay.MONDAY.getValue());
        System.out.println("Monday: "+ WeekDay.MONDAY.getShortCode());
        System.out.println("Monday message: "+ WeekDay.MONDAY.getMessage());
        
        System.out.println(appoint01.getWeekDay()+": "+ appoint01.getWeekDay().getMessage());
        
    }

}

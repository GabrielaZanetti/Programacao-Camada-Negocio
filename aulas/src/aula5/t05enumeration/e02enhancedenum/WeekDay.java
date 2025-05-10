
package aula5.t05enumeration.e02enhancedenum;

/**
 *
 * @author Eldair
 */
public enum WeekDay {
    SUNDAY(0,"Sun"), MONDAY(1,"Mon"), TUESDAY(2,"Tue"), 
    WEDNESDAY(3,"Wed"), THURSDAY(4,"Thu"), FRIDAY(5,"Fri"),
    SATURDAY(6,"Sat");
    
    private int value;
    private String shortCode;
    
    private WeekDay(int value, String shortCode){
        this.value = value;
        this.shortCode = shortCode;
    }

    public int getValue() {
        return value;
    }

    public String getShortCode() {
        return shortCode;
    }
    
    
    
}

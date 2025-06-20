package aula14_15.model;

/**
 * @author Eldair F. Dornelles
 */
public class Phone {
    private String type;
    private String number;

    public Phone(String type, String number) {
        this.type = type;
        this.number = number;
    }

    public Phone() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String phone) {
        this.number = phone;
    }

    @Override
    public String toString() {
        return "Phone{" + "type=" + type + ", number=" + number + '}';
    }
    
    
}

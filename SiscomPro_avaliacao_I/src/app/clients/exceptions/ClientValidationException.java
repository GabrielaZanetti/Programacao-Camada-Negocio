package app.clients.exceptions;

import java.util.Date;

/**
 *
 * @author gabriela.zanetti
 */
public class ClientValidationException extends Exception {
    Date date;
    
    public ClientValidationException(Exception ex) {
        super(ex);
        date = new Date();
    }
    
    public ClientValidationException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ClientValidationException(String ex) {
        super(ex);
        date = new Date();
    }
    
    @Override
    public String getMessage() {
        return date.toString() + " " + super.getMessage();
    }
}
